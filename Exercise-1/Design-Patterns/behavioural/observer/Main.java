package behavioural.observer;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Ride-Sharing App (Observer Pattern with Distance Filter) ===");

        RideRequestSubject subject = new RideRequestSubject();

        Driver d1 = new Driver("Alice", 2.5);
        Driver d2 = new Driver("Bob", 6.0);
        Driver d3 = new Driver("Charlie", 4.2);

        System.out.println("\n-- Registering drivers --");
        subject.register(d1);
        subject.register(d2);
        subject.register(d3);

        System.out.println("\n-- Ride Request: Passenger at Mall (5 km range) --");
        subject.notifyDriversWithinRange("Pickup at Mall", 5.0);

        System.out.println("\n-- Ride Request: Passenger at Airport (7 km range) --");
        subject.notifyDriversWithinRange("Pickup at Airport", 7.0);
    }
}
