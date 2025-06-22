public class Main {
    public static void main(String[] args) {
        Observer m=new MobileApp("John");
        Observer w=new WebApp("Almend");
        StockMarket stockMarket=new StockMarket();
        stockMarket.register(m);
        stockMarket.register(w);
        stockMarket.stockPrice(15896.68);
        stockMarket.deRegister(m);
    }
}