package creational.factory;

public class TxtFile implements FileExporter {
    @Override
    public void export(String content) {
        System.out.println("Exporting TXT: " + content);
    }
}
