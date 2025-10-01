package behavioural.observer;

public class Driver implements Observer {
    private final String name;
    private final double distanceFromPassenger; 

    public Driver(String name, double distanceFromPassenger) {
        this.name = name;
        this.distanceFromPassenger = distanceFromPassenger;
    }

    public double getDistanceFromPassenger() {
        return distanceFromPassenger;
    }

    @Override
    public void update(String message) {
        System.out.println("Driver " + name + " (Distance: " + distanceFromPassenger + " km) received: " + message);
    }
}
