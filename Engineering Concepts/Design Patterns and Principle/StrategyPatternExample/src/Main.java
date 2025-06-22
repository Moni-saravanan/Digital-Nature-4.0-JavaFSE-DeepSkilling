//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentContext c = new PaymentContext();
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456");
        c.setPaymentStrategy(creditCard);
        c.payAmount(15200.00);
        PaymentStrategy paypal = new PayPalPayment("user@gmail.com");
        c.setPaymentStrategy(paypal);
        c.payAmount(19990.99);
    }
}