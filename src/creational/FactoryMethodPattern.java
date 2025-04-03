package creational;

/**
 * Represents a product that is able to do stuff.
 */
interface Product {
    public void doStuff();
}

/**
 * Represents a specialization of Product.
 */
class ConcreteProductA implements Product {
    @Override
    public void doStuff() {
    }
}

/**
 * Represents another specialization of Product.
 */
class ConcreteProductB implements Product {
    @Override
    public void doStuff() {
    }
}

/**
 * Represents a class that has some core business logic related to Product.
 * This class also is responsible for creating Product objects.
 */
abstract class Creator {
    /**
     * Does some operation that is relevant to the core business logic
     * surrounding Product. These operations should use Product, so that they
     * will work with any concrete products.
     */
    public void someOperation() {
    }

    public abstract Product createProduct();
}

class ConcreteCreatorA extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductA(); // does not always have to create a new one
    }

}

class ConcreteCreatorB extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductB(); // does not always have to create a new one
    }

}

/**
 * Example usage of the factory method design pattern.
 */
class FactoryMethodPattern {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.someOperation();
        Product product = creatorA.createProduct();
        product.doStuff();
    }
}