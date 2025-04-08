package creational.factorymethodpattern;

/**
 * Represents a class that has some core business logic related to Product.
 * This class also is responsible for creating Product objects.
 */
abstract public class Creator {
    /**
     * Does some operation that is relevant to the core business logic
     * surrounding Product. These operations should use Product, so that they
     * will work with any concrete products.
     */
    public void someOperation() {
    }

    public abstract Product createProduct();
}
