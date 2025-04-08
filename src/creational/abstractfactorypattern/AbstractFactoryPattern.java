package creational.abstractfactorypattern;

/**
 * Example usage of the abstract factory design pattern.
 */
public class AbstractFactoryPattern {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory2();
        Client client = new Client(factory); // will work with products of variant 2
    }
}