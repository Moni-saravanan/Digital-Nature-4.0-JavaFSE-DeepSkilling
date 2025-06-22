public class CreditCardPayment implements PaymentStrategy{
    String cardNumber;
    public CreditCardPayment(String cardNumber) {
        this.cardNumber=cardNumber;
    }
    @Override
    public void pay(double amt) {
        System.out.println("Paid "+amt+" using Credit card number: "+cardNumber);
    }
}
