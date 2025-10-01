package exercise1.creational.singleton;

public class Clipboard {
    private static volatile Clipboard instance;
    private String content = "";
    private Clipboard() {}
    public static Clipboard getInstance() {
        if (instance == null) {
            synchronized (Clipboard.class) {
                if (instance == null) {
                    instance = new Clipboard();
                }
            }
        }
        return instance;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}