public interface PaymentGateway {
    void processPayment(String account, double amount);
}
