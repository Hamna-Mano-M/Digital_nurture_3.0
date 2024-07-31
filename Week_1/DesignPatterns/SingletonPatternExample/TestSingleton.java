//Step 3: test the Singleton implementation
public class TestSingleton{
    public static void main(String[] args) {
        // We create two objects l1 and l2 to get the instance log from the Logger class.
        Logger l1 = Logger.getLog();
        Logger l2 = Logger.getLog();

        //using the printOutput method, we give two different messages to the Logger class
        l1.printOutput("this is the l1 message");
        l2.printOutput("This is the l2 message");

        /* In the Singleton pattern,
        multiple calls to the getLog instance only refers to the same instance.
        */
        if(l1==l2){
            System.out.println("Singleton pattern");
        }
        else{
            System.out.println("Not Singleton pattern");
        }


    }
    
}
