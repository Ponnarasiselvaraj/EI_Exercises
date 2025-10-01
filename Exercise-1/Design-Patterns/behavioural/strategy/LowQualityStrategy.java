package behavioural.strategy;

public class LowQualityStrategy implements VideoQualityStrategy {
    @Override
    public void stream() {
        System.out.println("Streaming at 480p quality");
    }
}
