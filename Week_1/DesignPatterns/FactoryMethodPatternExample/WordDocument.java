/*
* WordDocument is a classes created using the Document interface
* */
public class WordDocument implements Document{
    //the @Override is used to override the interface and modify the program to suit the required condition

    @Override
    public void open(){
        System.out.println("Opening word Document");
    }
    public void close(){
        System.out.println("Closing Word Document");
    }
    public void save(){
        System.out.println("Saving Word Document");
    }
}
