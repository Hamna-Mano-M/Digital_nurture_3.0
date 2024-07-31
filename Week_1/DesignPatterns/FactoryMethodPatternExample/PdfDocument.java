/*
 * WordDocument is a classes created using the Document interface
 * */
public class PdfDocument implements Document {
    //the @Override is used to override the interface and modify the program to suit the required condition

    @Override
    public void open(){
        System.out.println("Opening PDF Document");
    }
    public void close(){
        System.out.println("Closing PDF Document");
    }
    public void save(){
        System.out.println("Saving PDF Document");
    }
}
