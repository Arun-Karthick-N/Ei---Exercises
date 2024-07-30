public class GiftWrapDecorator extends OrderDecorator {
    public GiftWrapDecorator(Order decoratedOrder) {
        super(decoratedOrder);
    }

    @Override
    public String getDescription() {
        return decoratedOrder.getDescription() + ", Gift Wrapped";
    }

    @Override
    public double getCost() {
        return decoratedOrder.getCost() + 5.0;
    }
}
