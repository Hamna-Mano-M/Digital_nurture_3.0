/*
3.	Implement Adaptee Classes:
Create classes for different payment gateways with their own methods.

 */
public class GPay {
    public void getPaid(int amount){
        System.out.println("Received amount "+amount+" via GPay");
    }
}
