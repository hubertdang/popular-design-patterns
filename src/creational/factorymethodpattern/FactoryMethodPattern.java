package creational.factorymethodpattern;

/**
 * Example usage of the factory method design pattern.
 */
public class FactoryMethodPattern {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.someOperation();
        Product product = creatorA.createProduct();
        product.doStuff();
    }
}
