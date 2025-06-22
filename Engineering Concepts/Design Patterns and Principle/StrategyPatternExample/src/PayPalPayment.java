public class PayPalPayment implements PaymentStrategy{
    String email;
    public PayPalPayment(String email) {
        this.email=email;
    }
    @Override
    public void pay(double amt) {
        System.out.println("Paid "+amt+" using PayPay email: "+email);

    }
}
