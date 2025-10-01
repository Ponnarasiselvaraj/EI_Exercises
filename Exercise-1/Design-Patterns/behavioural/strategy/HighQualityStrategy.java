package exercise1.behavioural.strategy;

public class HighQualityStrategy implements VideoQualityStrategy {
    @Override
    public void stream() {
        System.out.println("Streaming at 4K quality");
    }
}