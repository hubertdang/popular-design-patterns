package creational.abstractfactorypattern;

/**
 * Represents a factory that can create each of the abstract products.
 */
public interface AbstractFactory {
    public ProductA createProductA();

    public ProductB createProductB();
}