package exercise1.structural.adapter;

public class Main {
    public static void main(String[] args) {
        OldAttendanceRecord old1 = new OldAttendanceRecord("Alice", "Present");
        OldAttendanceRecord old2 = new OldAttendanceRecord("Bob", "Absent");

        System.out.println("=== Old System Records ===");
        System.out.println(old1.getName() + " -> " + old1.getStatus());
        System.out.println(old2.getName() + " -> " + old2.getStatus());

        System.out.println("\n=== Conversion Using Adapter ===");
        NewBiometricRecord new1 = AttendanceAdapter.adapt(old1);
        NewBiometricRecord new2 = AttendanceAdapter.adapt(old2);

        System.out.println("Converting '" + old1.getStatus() + "' → " + new1.getPresent());
        System.out.println("Converting '" + old2.getStatus() + "' → " + new2.getPresent());

        System.out.println("\n=== New Biometric System Records ===");
        System.out.println(new1);
        System.out.println(new2);
    }
}
