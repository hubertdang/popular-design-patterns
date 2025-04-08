package creational.abstractfactorypattern;

/**
 * Represents a client that can create any product type, without knowing its
 * variant. The variant can be customized by passing a concrete factory.
 */
public class Client {
    private AbstractFactory factory;

    public Client(AbstractFactory factory) {
        this.factory = factory;
    }

    public void someOperation() {
        ProductA productA = factory.createProductA(); // any variant (1 or 2)
        // do stuff with productA
    }
}