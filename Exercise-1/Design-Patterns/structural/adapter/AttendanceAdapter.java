package exercise1.structural.adapter;

public class AttendanceAdapter {
    public static NewBiometricRecord adapt(OldAttendanceRecord oldRecord) {
        String status = oldRecord.getStatus().trim().toLowerCase();
        int val = "present".equals(status) ? 1 : 0;
        return new NewBiometricRecord(oldRecord.getName(), val);
    }
}