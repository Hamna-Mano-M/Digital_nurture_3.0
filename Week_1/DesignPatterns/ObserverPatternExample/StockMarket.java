import java.util.*;
import java.util.Observer;

public class StockMarket implements Stock{
    private List<Observer> observers;
    private double StockPrice;

    public StockMarket(){
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer o){
        observers.add(o);
    }
    @Override
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    @Override
    public void notifyObserver(){
        for(Observer observer: observers){
            observer.update(this,null);
        }
    }
    public void setStockPrice(double stockPrice){
        this.StockPrice = StockPrice;
        notifyObserver();
    }
    public double getStockPrice(){
        return StockPrice;
    }
}
