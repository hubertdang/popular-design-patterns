package creational;

/**
 * Represents a distrinct product type that is part of a product family.
 */
interface ProductA {
}

/**
 * Represents another distrinct product type that is part of a product family.
 */
interface ProductB {
}

/**
 * Represents a product type A, variant 1.
 */
class ConcreteProductA1 implements ProductA {
}

/**
 * Represents a product type B, variant 1.
 */
class ConcreteProductB1 implements ProductB {
}

/**
 * Represents a product type A, variant 2.
 */
class ConcreteProductA2 implements ProductA {
}

/**
 * Represents a product type B, variant 2.
 */
class ConcreteProductB2 implements ProductB {
}

/**
 * Represents a factory that can create each of the abstract products.
 */
interface AbstractFactory {
    public ProductA createProductA();

    public ProductB createProductB();
}

/**
 * Represents a factory that corresponds to products of variant 1.
 */
class ConcreteFactory1 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}

/**
 * Represents a factory that corresponds to products of variant 2.
 */
class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}

/**
 * Represents a client that can create any product type, without knowing its
 * variant. The variant can be customized by passing a concrete factory.
 */
class Client {
    private AbstractFactory factory;

    public Client(AbstractFactory factory) {
        this.factory = factory;
    }

    public void someOperation() {
        ProductA productA = factory.createProductA(); // any variant (1 or 2)
        // do stuff with productA
    }
}

/**
 * Example usage of the abstract factory design pattern.
 */
class AbstractFactoryPattern {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory2();
        Client client = new Client(factory); // will work with products of variant 2
    }
}
