/*
4.	Implement Proxy Class:
	Create a class ProxyImage that implements Image and holds a reference to RealImage.
	Implement lazy initialization and caching in ProxyImage.

 */
public class ProxyImage implements Image{
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename){
        this.filename = filename;
    }

    @Override
    public void display(){
        if(realImage == null){
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
