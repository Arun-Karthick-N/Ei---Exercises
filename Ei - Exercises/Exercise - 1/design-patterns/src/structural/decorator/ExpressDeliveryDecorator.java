public class ExpressDeliveryDecorator extends OrderDecorator {
    public ExpressDeliveryDecorator(Order decoratedOrder) {
        super(decoratedOrder);
    }

    @Override
    public String getDescription() {
        return decoratedOrder.getDescription() + ", Express Delivery";
    }

    @Override
    public double getCost() {
        return decoratedOrder.getCost() + 20.0;
    }
}
