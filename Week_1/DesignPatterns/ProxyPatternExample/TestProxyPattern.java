/*
5.	Test the Proxy Implementation:
	Create a test class to demonstrate the use of ProxyImage to load and display images.

 */
public class TestProxyPattern{
    public static void main(String[] args) {
        Image img1 = new ProxyImage("img1.png");
        Image img2 = new ProxyImage("img2.png");

        System.out.println("Displaying img1.png");
        img1.display();

        System.out.println("Displaying img2.png");
        img2.display();


    }
    
}
