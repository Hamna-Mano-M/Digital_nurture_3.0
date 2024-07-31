/*
5.	Test the Builder Implementation:
Create a test class to demonstrate the creation of different configurations of Computer using the Builder pattern.

 */
public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer normalComp = new Computer.Builder()
                .setCPU("Intel")
                .setRAM("6GB")
                .setStorage("256GB")
                .build();
        Computer gamingComp = new Computer.Builder()
                .setCPU("Intel")
                .setRAM("16GB")
                .setStorage("1TB")
                .build();
        System.out.println("Normal computer");
        System.out.println("CPU:" + normalComp.getCPU());
        System.out.println("RAM:" + normalComp.getRAM());
        System.out.println("Storage:" + normalComp.getStorage());
        System.out.println("*************");

        System.out.println("Gaming computer");
        System.out.println("CPU:" + gamingComp.getCPU());
        System.out.println("RAM:" + gamingComp.getRAM());
        System.out.println("Storage:" + gamingComp.getStorage());
        System.out.println("*************");




    }
}
