package structural.bridgepattern;

/**
 * Example usage of the bridge design pattern.
 */
public class BridgePattern {
    public static void main(String[] args) {
        Implementation concreteImplementation = new ConcreteImplementation1();
        Abstraction clientAbstraction = new Abstraction(concreteImplementation);
        // usually, client is only interested in working with the abstraction
        clientAbstraction.feature1();
        clientAbstraction.feature2();
    }
}
