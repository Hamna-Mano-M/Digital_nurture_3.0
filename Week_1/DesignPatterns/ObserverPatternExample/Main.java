public class Main {
    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("MOBILE1");
        Observer mobileApp2 = new MobileApp("MOBILE2");
        Observer webApp = new WebApp("WEB1");

        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice(100.10);
        stockMarket.setStockPrice(5648.00);

        stockMarket.deregisterObserver(mobileApp2);
        stockMarket.setStockPrice(234.45);
    }
}
