package structural.adapter;

public class OldAttendanceRecord {
    private final String name;
    private final String status;
    public OldAttendanceRecord(String name, String status) {
        this.name = name;
        this.status = status;
    }
    public String getName() {
        return name;
    }
    public String getStatus() {
        return status;
    }
}
