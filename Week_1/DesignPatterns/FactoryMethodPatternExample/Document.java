/**?
 * Step 1: Create a new Java Project named FactoryMethodPatternExample
 *Step 2: o	Create interfaces or abstract classes for different document types such as WordDocument, PdfDocument, and ExcelDocument
 * The public Interface Document has 3 methods open, close, save
 */
public interface Document {
    void open();
    void close();
    void save();
}
