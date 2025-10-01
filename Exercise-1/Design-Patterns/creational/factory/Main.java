package creational.factory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Universal-file-export App (Factory Pattern) ===");
        FileExporter txt = FileFactory.create(FileFactory.Format.TXT);
        txt.export("Hello TXT");
        FileExporter pdf = FileFactory.create(FileFactory.Format.PDF);
        pdf.export("Hello PDF");
        FileExporter docx = FileFactory.create(FileFactory.Format.DOCX);
        docx.export("Hello DOCX");
    }
}
