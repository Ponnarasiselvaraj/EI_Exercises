package exercise1.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class RideRequestSubject {
    private final List<Driver> drivers = new ArrayList<>();

    public void register(Driver d) {
        drivers.add(d);
    }

    public void unregister(Driver d) {
        drivers.remove(d);
    }

    public void notifyDriversWithinRange(String request, double maxRangeKm) {
        for (Driver d : new ArrayList<>(drivers)) {
            if (d.getDistanceFromPassenger() <= maxRangeKm) {
                d.update(request);
            }
        }
    }
}
