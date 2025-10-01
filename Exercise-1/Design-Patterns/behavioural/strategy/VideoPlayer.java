package behavioural.strategy;

public class VideoPlayer {
    private VideoQualityStrategy strategy;
    public VideoPlayer(VideoQualityStrategy strategy) {
        this.strategy = strategy;
    }
    public void setStrategy(VideoQualityStrategy strategy) {
        this.strategy = strategy;
    }
    public void play() {
        strategy.stream();
    }
}
