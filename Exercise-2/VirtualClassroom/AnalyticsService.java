package VirtualClassroom;

import java.util.List;

public class AnalyticsService {
    private final DataStore store;

    public AnalyticsService(DataStore store) {
        this.store = store;
    }

    public void printReport() {
        try {
            if (store.classrooms.isEmpty()) {
                System.out.println("No classrooms available.");
                return;
            }
            for (Classroom c : store.classrooms.values()) {
                System.out.println("class " + c.getName());
                List<String> sids = c.getStudentIds();
                if (sids.isEmpty()) {
                    System.out.println("  (no students)\n"); continue;
                }
                for (String sid : sids) {
                    Student s = store.students.get(sid);
                    if (s != null) {
                        System.out.println("  " + s.toString());
                    } else {
                        System.out.println("  student " + sid + " (no record)");
                    }
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println("Error generating analytics: " + e.getMessage());
        }
    }
}
