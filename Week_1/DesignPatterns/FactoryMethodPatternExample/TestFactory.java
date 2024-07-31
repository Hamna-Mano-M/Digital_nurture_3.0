/*
* the TestFactory class is used to test the Factory Design Pattern

 */
import javax.print.Doc;

public class TestFactory {
    public static void main(String[] args) {
        //An object called wordFile is created in the class DocumentFactory
        DocumentFactory wordFile = new WordDocumentFactory();
        //wordDoc is an object used to call the methods open, save, close from the interface "Document".
        Document wordDoc = wordFile.createDocument();
        wordDoc.open();
        wordDoc.save();
        wordDoc.close();
        System.out.println("********");


        DocumentFactory pdfFile = new PdfDocumentFactory();
        Document pdfDoc = pdfFile.createDocument();
        pdfDoc.open();
        pdfDoc.save();
        pdfDoc.close();
        System.out.println("********");


        DocumentFactory excelFile = new ExcelDocumentFactory();
        Document excelDoc = excelFile.createDocument();
        excelDoc.open();
        excelDoc.save();
        excelDoc.close();
        System.out.println("********");



    }
}
