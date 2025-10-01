package VirtualClassroom;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Classroom implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String name;
    private final List<String> studentIds = new CopyOnWriteArrayList<>();
    private final List<Assignment> assignments = new ArrayList<>();

    public Classroom(String name) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException("class name required");
        this.name = name.trim();
    }

    public String getName() {
        return name;
    }

    public void addStudentId(String studentId) {
        if (studentId == null || studentId.trim().isEmpty()) return;
        if (!studentIds.contains(studentId)) studentIds.add(studentId);
    }

    public void removeStudentId(String studentId) {
        studentIds.remove(studentId);
    }

    public List<String> getStudentIds() {
        return Collections.unmodifiableList(studentIds);
    }

    public synchronized void addAssignment(Assignment a) {
        if (a == null) return;
        assignments.add(a);
    }

    public List<Assignment> getAssignments() {
        return Collections.unmodifiableList(assignments);
    }
}
