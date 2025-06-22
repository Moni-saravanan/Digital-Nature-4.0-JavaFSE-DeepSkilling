public class WebApp implements Observer{
    String name;
    public WebApp(String name) {
        this.name=name;
    }
    @Override
    public void update(double price) {
        System.out.println("Stock price updated: "+price);
    }
}
