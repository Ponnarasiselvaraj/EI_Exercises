package behavioural.strategy;

public class StandardQualityStrategy implements VideoQualityStrategy {
    @Override
    public void stream() {
        System.out.println("Streaming at 1080p quality");
    }
}
