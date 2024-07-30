import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<String> items;
    private PaymentMethod paymentMethod;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout() {
        double total = items.size() * 10.0; // Assume each item costs 10
        paymentMethod.pay(total);
    }
}
