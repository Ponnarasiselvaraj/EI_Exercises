# Factory Method Pattern

 📌 Category

Creational Pattern

## 📖 Overview
The **Factory Method Pattern** provides an interface for creating objects but lets subclasses or factories decide which class to instantiate.

## 💡 Use Case in This Project
The pattern is used for a **File Exporter System**:
- Users can export files in different formats: PDF, DOCX, TXT.
- The `FileFactory` decides which file object to create based on the requested type.
- The client code (`Main.java`) remains unchanged when adding new file formats.

This centralizes object creation and makes the system flexible for future file types.

## 📂 Files
- `Main.java` – Demonstrates file export functionality.
- `FileFactory.java` – Factory class to generate files.
- `FileExporter.java` – Common interface for file types.
- `PdfFile.java` – Concrete product for PDF.
- `DocxFile.java` – Concrete product for DOCX.
- `TxtFile.java` – Concrete product for TXT.
