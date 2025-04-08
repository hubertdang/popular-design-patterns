package creational.abstractfactorypattern;

/**
 * Represents a factory that corresponds to products of variant 2.
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}