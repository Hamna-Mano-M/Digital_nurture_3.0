/*
3.	Implement Real Subject Class:
	Create a class RealImage that implements Image and loads an image from a remote server.

 */
public class RealImage implements Image {
    private String filename;

    public RealImage(String filename){
        this.filename = filename;
        loadFromRemoteServer();

    }
    private void loadFromRemoteServer(){
        System.out.println("Loading "+filename+" from remote server");

        System.out.println(filename+" loaded");
    }
    @Override
    public void display(){
        System.out.println("currently viewing "+filename);
    }
}
