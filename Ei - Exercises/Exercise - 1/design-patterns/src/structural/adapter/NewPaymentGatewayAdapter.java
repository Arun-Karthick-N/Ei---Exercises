public class NewPaymentGatewayAdapter implements PaymentGateway {
    private NewPaymentGateway newPaymentGateway;

    public NewPaymentGatewayAdapter(NewPaymentGateway newPaymentGateway) {
        this.newPaymentGateway = newPaymentGateway;
    }

    @Override
    public void processPayment(String account, double amount) {
        newPaymentGateway.makePayment(account, amount);
    }
}
