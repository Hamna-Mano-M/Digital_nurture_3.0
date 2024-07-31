/*
* Create concrete factory classes for each document type that extends DocumentFactory and implements the createDocument() method.
* WordDocumentFactory, PdfDocumentFactory and ExcelDocumentFactory are concrete classes that implements the createDocument() method
* */
public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
