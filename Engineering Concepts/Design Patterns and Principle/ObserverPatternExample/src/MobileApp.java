public class MobileApp implements Observer{
    String name;
    public MobileApp(String name) {
        this.name=name;
    }
    @Override
    public void update(double price) {
        System.out.println("Stock Price updated: "+price);
    }
}
