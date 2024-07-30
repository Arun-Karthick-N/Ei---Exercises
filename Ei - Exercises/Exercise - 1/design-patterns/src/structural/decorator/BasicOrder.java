public class BasicOrder implements Order {
    @Override
    public String getDescription() {
        return "Order";
    }

    @Override
    public double getCost() {
        return 50.0;
    }
}
