package creational.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== System Clipboard (Singleton) ===");

        Clipboard clipboard1 = Clipboard.getInstance();
        clipboard1.setContent("Copied: Hello World");
        System.out.println("Clipboard1 content: " + clipboard1.getContent());

        Clipboard clipboard2 = Clipboard.getInstance();
        System.out.println("Clipboard2 content (should be same): " + clipboard2.getContent());

        System.out.println("\n=== Overwriting Clipboard Content ===");
        clipboard2.setContent("Copied: Singleton Pattern Demo");
        System.out.println("Clipboard1 content after overwrite: " + clipboard1.getContent());
        System.out.println("Clipboard2 content after overwrite: " + clipboard2.getContent());

        System.out.println("\nBoth references point to the SAME clipboard instance.");
    }
}
