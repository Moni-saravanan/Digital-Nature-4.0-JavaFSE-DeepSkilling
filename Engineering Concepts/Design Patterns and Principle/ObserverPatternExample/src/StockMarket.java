import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock{
    double price;
    List<Observer> observer=new ArrayList<>();
    @Override
    public void register(Observer o) {
        System.out.println("Thank you for Registering");
        observer.add(o);
    }

    @Override
    public void deRegister(Observer o) {
        observer.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o: observer) {
            o.update(price);
        }
    }

    public void stockPrice(double price){
        this.price=price;
        notifyObserver();
    }
}
