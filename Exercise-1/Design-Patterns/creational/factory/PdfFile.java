package creational.factory;

public class PdfFile implements FileExporter {
    @Override
    public void export(String content) {
        System.out.println("Exporting PDF: " + content);
    }
}
