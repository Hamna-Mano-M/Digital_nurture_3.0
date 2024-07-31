import java.util.Observer;

public interface Stock {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();


}

