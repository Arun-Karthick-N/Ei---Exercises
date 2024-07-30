public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Book");
        cart.addItem("Pen");

        cart.setPaymentMethod(new CreditCardPayment("1234567890123456"));
        cart.checkout();

        cart.setPaymentMethod(new PayPalPayment("user@example.com"));
        cart.checkout();
    }
}
