package VirtualClassroom;

public class AssignmentService {
    private final DataStore store;
    private final PersistenceManager persistence;

    public AssignmentService(DataStore store, PersistenceManager persistence) {
        this.store = store;
        this.persistence = persistence;
    }

    public void assignToClass(String className, String details) {
        try {
            if (details == null || details.trim().isEmpty()) {
                System.out.println("Assignment details cannot be empty.");
                return;
            }
            Classroom c = store.classrooms.get(className);
            if (c == null) {
                System.out.println("Classroom not found: " + className);
                return;
            }
            Assignment a = new Assignment(details.trim());
            c.addAssignment(a);
            for (String sid : c.getStudentIds()) {
                Student s = store.students.get(sid);
                if (s != null) s.incrementAssigned();
            }
            persistence.save(store);
            System.out.println("Assignment assigned to class " + className + ": " + details.trim());
        } catch (Exception e) {
            System.err.println("Error assigning to class: " + e.getMessage());
        }
    }

    public void submit(String studentId, String className, String details) {
        try {
            Classroom c = store.classrooms.get(className);
            if (c == null) {
                System.out.println("Classroom not found: " + className);
                return;
            }
            if (!c.getStudentIds().contains(studentId)) {
                System.out.println("Student " + studentId + " is not in class " + className);
                return;
            }
            Student s = store.students.get(studentId);
            if (s == null) {
                System.out.println("Student record not found: " + studentId);
                return;
            }
            s.incrementSubmitted();
            persistence.save(store);
            System.out.println("Student " + studentId + " submitted an assignment for " + className);
        } catch (Exception e) {
            System.err.println("Error submitting assignment: " + e.getMessage());
        }
    }
}
