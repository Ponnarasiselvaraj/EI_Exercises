package exercise1.creational.factory;

public class DocxFile implements FileExporter {
    @Override
    public void export(String content) {
        System.out.println("Exporting DOCX: " + content);
    }
}