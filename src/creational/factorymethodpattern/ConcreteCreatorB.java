package creational.factorymethodpattern;

public class ConcreteCreatorB extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductB(); // does not always have to create a new one
    }
}
