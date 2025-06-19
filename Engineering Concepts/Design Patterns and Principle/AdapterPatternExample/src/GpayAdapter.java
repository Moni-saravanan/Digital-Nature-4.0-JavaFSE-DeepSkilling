public class GpayAdapter implements PaymentProcessor {
    Gpay gpay;
    GpayAdapter(Gpay gpay) {
        this.gpay=gpay;
    }
    @Override
    public void processorPayment(double amt) {
        gpay.makePayment(amt);
    }
}
