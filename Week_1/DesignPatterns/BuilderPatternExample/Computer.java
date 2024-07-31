/*
* 1.	Create a New Java Project:
o	Create a new Java project named BuilderPatternExample.
2.	Define a Product Class:
* o	Create a class Computer with attributes like CPU, RAM, Storage, etc
*/
public class Computer{
    private String CPU;
    private String RAM;
    private String storage;

    /*
    3.	Implement the Builder Class:
    Create a static nested Builder class inside Computer with methods to set each attribute
    *The private class Computer has a private Constructor that can only be accessed by the "Builder" class

     */
    private Computer(Builder builder){
        this.CPU = Builder.CPU;
        this.RAM = Builder.RAM;
        this.storage= Builder.storage;


    }
    public String getCPU(){
        return CPU;
    }
    public String getRAM(){
        return RAM;
    }
    public String getStorage(){
        return storage;
    }
//The private class Builder is the key concept that defines the Builder Design Pattern.
    //Builder class provides step-by-step building process

    public static class Builder{
        private static String CPU;
        private static String RAM;
        private static String storage;

        public Builder setCPU(String CPU){
            this.CPU = CPU;
            return this;
        }
        public Builder setRAM(String RAM){
            this.RAM = RAM;
            return this;
        }
        public Builder setStorage(String storage){
            this.storage = storage;
            return this;
        }
        //Provide a build() method in the Builder class that returns an instance of Computer.
        //The build method is used to create a new Computer object
        public Computer build(){
            return new Computer(this);
        }

    }


}