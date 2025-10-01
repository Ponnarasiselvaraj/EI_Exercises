package creational.factory;

public class FileFactory {
    public enum Format { TXT, PDF, DOCX }
    public static FileExporter create(Format f) {
        switch(f) {
            case PDF: return new PdfFile();
            case DOCX: return new DocxFile();
            default: return new TxtFile();
        }
    }
}
