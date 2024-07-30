public class SingletonPatternDemo {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Message 1");
        logger2.log("Message 2");

        System.out.println("Logger1 and Logger2 are the same instance: " + (logger1 == logger2));
    }
}
