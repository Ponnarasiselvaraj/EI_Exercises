package VirtualClassroom;

public class AttendanceService {
    private final DataStore store;
    private final PersistenceManager persistence;

    public AttendanceService(DataStore store, PersistenceManager persistence) {
        this.store = store;
        this.persistence = persistence;
    }

    public void markAttendance(String studentId, String className) {
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
            s.incrementAttendance();
            persistence.save(store);
            System.out.println("Marked present: " + studentId + " in " + className);
        } catch (Exception e) {
            System.err.println("Error marking attendance: " + e.getMessage());
        }
    }
}
