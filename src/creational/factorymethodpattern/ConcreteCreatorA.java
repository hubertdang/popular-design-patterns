package creational.factorymethodpattern;

public class ConcreteCreatorA extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductA(); // does not always have to create a new one
    }
}
