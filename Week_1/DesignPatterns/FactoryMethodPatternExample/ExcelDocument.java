/*
 * WordDocument is a classes created using the Document interface
 * */
public class ExcelDocument implements Document {
    //the @Override is used to override the interface and modify the program to suit the required condition
    @Override
    public void open(){
        System.out.println("Opening Excel Document");
    }
    public void close(){
        System.out.println("Closing Excel Document");
    }
    public void save(){
        System.out.println("Saving Excel Document");
    }
}
