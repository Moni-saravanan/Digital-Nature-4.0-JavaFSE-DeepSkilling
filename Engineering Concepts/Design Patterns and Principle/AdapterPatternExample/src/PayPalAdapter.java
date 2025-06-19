public class PayPalAdapter implements PaymentProcessor{
    PayPal paypal;
    public PayPalAdapter(PayPal payPal) {
        this.paypal=payPal;
    }
    @Override
    public void processorPayment(double amt) {
        paypal.sendPayment(amt);
    }
}
