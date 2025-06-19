//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gpay gpay=new Gpay();
        gpay.makePayment(20000);
        PaymentProcessor pay=new GpayAdapter(gpay);

        PayPal paypal=new PayPal();
        paypal.sendPayment(568000.31);
        PaymentProcessor pay1=new PayPalAdapter(paypal);

    }
}