public class PaymentContext {
    PaymentStrategy strategy;
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy=strategy;
    }
    public void payAmount(double amount) {
        if (strategy == null) {
            System.out.println("No payment method selected!");
        } else {
            strategy.pay(amount);
        }
    }
}
