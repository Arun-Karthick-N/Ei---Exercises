public class AdapterPatternDemo {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new NewPaymentGatewayAdapter(new NewPaymentGateway());
        paymentGateway.processPayment("customer123", 100.0);
    }
}
