package exercise1.behavioural.strategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Video-Streaming App (Strategy Pattern) ===");
        VideoPlayer player = new VideoPlayer(new StandardQualityStrategy());
        player.play();
        player.setStrategy(new LowQualityStrategy());
        player.play();
        player.setStrategy(new HighQualityStrategy());
        player.play();
    }
}