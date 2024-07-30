public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Order order = new BasicOrder();
        System.out.println(order.getDescription() + " Cost: " + order.getCost());

        Order giftWrappedOrder = new GiftWrapDecorator(order);
        System.out.println(giftWrappedOrder.getDescription() + " Cost: " + giftWrappedOrder.getCost());

        Order expressOrder = new ExpressDeliveryDecorator(giftWrappedOrder);
        System.out.println(expressOrder.getDescription() + " Cost: " + expressOrder.getCost());
    }
}
