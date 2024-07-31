import java.util.Observable;
public class MobileApp implements Observer{
    private String name;

    public MobileApp(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg){
        if(o instanceof StockMarket){
            StockMarket stockMarket = (StockMarket) o;
            System.out.println(("RECIEVED STROCK PRICE UPDATE"+stockMarket.getStockPrice()));
        }
    }
}
