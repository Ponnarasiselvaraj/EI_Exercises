package VirtualClassroom;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String id;
    private int attendanceCount;
    private int assignedAssignments;
    private int submittedAssignments;

    public Student(String id) {
        if (id == null || id.trim().isEmpty()) throw new IllegalArgumentException("student id required");
        this.id = id.trim();
    }

    public String getId() {
        return id;
    }

    public synchronized int getAttendanceCount() {
        return attendanceCount;
    }

    public synchronized int getAssignedAssignments() {
        return assignedAssignments;
    }

    public synchronized int getSubmittedAssignments() {
        return submittedAssignments;
    }

    public synchronized void incrementAttendance() {
        attendanceCount++;
    }

    public synchronized void incrementAssigned() {
        assignedAssignments++;
    }

    public synchronized void incrementSubmitted() {
        submittedAssignments++;
    }

    @Override
    public String toString() {
        return String.format("student %s  attendance : %d  assigned_assignments : %d  submitted : %d",
                id, attendanceCount, assignedAssignments, submittedAssignments);
    }
}
