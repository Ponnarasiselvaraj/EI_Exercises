package VirtualClassroom;

import java.util.Scanner;
import java.util.NoSuchElementException;

public class VirtualClassroomManager {
    private final DataStore store;
    private final PersistenceManager persistence;
    private final AttendanceService attendanceService;
    private final AssignmentService assignmentService;
    private final AnalyticsService analyticsService;

    public VirtualClassroomManager(DataStore store, PersistenceManager persistence) {
        this.store = store;
        this.persistence = persistence;
        this.attendanceService = new AttendanceService(store, persistence);
        this.assignmentService = new AssignmentService(store, persistence);
        this.analyticsService = new AnalyticsService(store);
    }

    public void addClassroom(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Class name required.");
            return;
        }
        try {
            store.classrooms.putIfAbsent(name.trim(), new Classroom(name.trim()));
            persistence.save(store);
            System.out.println("Classroom added: " + name.trim());
        } catch (Exception e) {
            System.err.println("Error adding classroom: " + e.getMessage());
        }
    }

    public void addStudent(String studentId, String className) {
        if (studentId == null || studentId.trim().isEmpty() || className == null || className.trim().isEmpty()) {
            System.out.println("Usage: add_student <studentId> <className>");
            return;
        }
        try {
            Classroom c = store.classrooms.get(className.trim());
            if (c == null) {
                System.out.println("Classroom not found: " + className);
                return;
            }
            Student s = store.students.computeIfAbsent(studentId.trim(), Student::new);
            c.addStudentId(studentId.trim());
            persistence.save(store);
            System.out.println("Student " + studentId.trim() + " added to " + className.trim());
        } catch (Exception e) {
            System.err.println("Error adding student: " + e.getMessage());
        }
    }

    public void markAttendance(String studentId, String className) {
        attendanceService.markAttendance(studentId, className);
    }

    public void assignToClass(String className, String details) {
        assignmentService.assignToClass(className, details);
    }

    public void submitAssignment(String studentId, String className, String details) {
        assignmentService.submit(studentId, className, details);
    }

    public void viewAnalytics() {
        analyticsService.printReport();
    }

    public void listClassrooms() {
        if (store.classrooms.isEmpty()) {
            System.out.println("No classrooms.");
            return;
        }
        System.out.println("Classrooms:");
        for (String name : store.classrooms.keySet()) {
            System.out.println(" - " + name);
        }
    }

    public void listStudents(String className) {
        Classroom c = store.classrooms.get(className);
        if (c == null) {
            System.out.println("Classroom not found: " + className);
            return;
        }
        System.out.println("Students in " + className + ":");
        for (String sid : c.getStudentIds()) {
            System.out.println(" - " + sid);
        }
    }

    public void runCli() {
        Scanner sc = new Scanner(System.in);
        printWelcome();
        boolean running = true;
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                persistence.save(store);
            } catch (Exception e) {
                System.err.println("Error during shutdown save: " + e.getMessage());
            }
        }));
        while (running) {
            System.out.print("> ");
            String line = null;
            try {
                line = sc.nextLine();
            } catch (NoSuchElementException e) {
           
                System.out.println("\nInput closed. Exiting...");
                persistence.save(store);
                break;
            }
            if (line == null) break;
            line = line.trim();
            if (line.isEmpty()) continue;

            String[] parts = line.split(" ", 4);
            String cmd = parts[0];

            try {
                switch (cmd) {
                    case "help":
                        printHelp();
                        break;
                    case "add_classroom":
                        if (parts.length > 1) addClassroom(parts[1]);
                        else System.out.println("Usage: add_classroom <name>");
                        break;
                    case "add_student":
                        if (parts.length > 2) addStudent(parts[1], parts[2]);
                        else System.out.println("Usage: add_student <studentId> <className>");
                        break;
                    case "mark_attendance":
                        if (parts.length > 2) markAttendance(parts[1], parts[2]);
                        else System.out.println("Usage: mark_attendance <studentId> <className>");
                        break;
                    case "assign":
                        if (parts.length > 2) assignToClass(parts[1], parts[2]);
                        else System.out.println("Usage: assign <className> <assignment details>");
                        break;
                    case "submit":
                        if (parts.length > 3) {
                            String studentId = parts[1];
                            String className = parts[2];
                            String details = parts[3];
                            submitAssignment(studentId, className, details);
                        } else {
                            System.out.println("Usage: submit <studentId> <className> <assignment details>");
                        }
                        break;
                    case "view_analytics":
                        viewAnalytics();
                        break;
                    case "list_classrooms":
                        listClassrooms();
                        break;
                    case "list_students":
                        if (parts.length > 1) listStudents(parts[1]);
                        else System.out.println("Usage: list_students <className>");
                        break;
                    case "exit":
                        running = false;
                        persistence.save(store);
                        break;
                    default:
                        System.out.println("Unknown command. Type 'help'.");
                        break;
                }
            } catch (Exception e) {
                System.err.println("Error processing command: " + e.getMessage());
            }
        }
        sc.close();
    }

    private void printWelcome() {
        System.out.println("Welcome to Virtual Classroom Manager App");
        System.out.println("Available commands:");
        System.out.println("  add_classroom <name>");
        System.out.println("  add_student <studentId> <className>");
        System.out.println("  mark_attendance <studentId> <className>");
        System.out.println("  assign <className> <assignment details>");
        System.out.println("  submit <studentId> <className> <assignment details>");
        System.out.println("  view_analytics");
        System.out.println("  list_classrooms");
        System.out.println("  list_students <className>");
        System.out.println("  help");
        System.out.println("  exit");
    }

    private void printHelp() {
        printWelcome();
    }
}
