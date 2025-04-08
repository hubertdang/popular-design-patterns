package structural.bridgepattern;

/**
 * Represents an abstraction that provides high-level control logic. It relies
 * on the implementation object to do the actual low-level work.
 */
public class Abstraction {
    private Implementation i; // can be any concrete implementation

    public Abstraction(Implementation i) {
        this.i = i;
    }

    public void feature1() {
        i.method1();
    }

    public void feature2() {
        i.method2();
        i.method3();
    }
}
