package exercise1.structural.adapter;

public class NewBiometricRecord {
    private final String name;
    private final int present;
    public NewBiometricRecord(String name, int present) {
        this.name = name;
        this.present = present;
    }
    public String getName() {
        return name;
    }
    public int getPresent() {
        return present;
    }
    @Override
    public String toString() {
        return name + " -> " + present;
    }
}