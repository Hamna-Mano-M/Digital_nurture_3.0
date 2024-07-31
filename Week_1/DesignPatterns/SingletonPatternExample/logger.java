//step 1 : create a new JAVA project SingletonPatternExample
//Define a class named Logger
class Logger{
    //Class logger has a private static instance of itself named log
    private static Logger log;
    //private constructor of the class Logger is given as:
    private Logger(){

    }
    // public static method to get the instance of the logger class
    // the synchronised access is given to the getLog method to ensure only one thread is accessed at a time.
    public static synchronized Logger getLog() {
        //if the log instance is empty, the method gets a new log
        if(log == null){
            log = new Logger();
        }
        return log;
    }
    //method to print the string given as an input to the getLog method
    public void printOutput(String outputString){
        System.out.println(outputString);
    }
    /*
    step 2: implement the singleton pattern
    The above code implements Singleton pattern as it has only one instance "log".
    The instance is given global access through the public static method.
    */
}

