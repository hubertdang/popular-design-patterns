package structural;

/**
 * Represents an abstraction that provides high-level control logic. It relies
 * on the implementation object to do the actual low-level work.
 */
class Abstraction {
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

/**
 * Represents the common interface for all concrete implementations.
 */
interface Implementation {
    public void method1();

    public void method2();

    public void method3();
}

/**
 * Represents an implementation with platform-specific code.
 */
class ConcreteImplementation1 implements Implementation {
    @Override
    public void method1() {
    }

    @Override
    public void method2() {
    }

    @Override
    public void method3() {
    }
}

/**
 * Represents another implementation with platform-specific code.
 */
class ConcreteImplementation2 implements Implementation {
    @Override
    public void method1() {
    }

    @Override
    public void method2() {
    }

    @Override
    public void method3() {
    }
}

/**
 * Example usage of the bridge design pattern.
 */
class BridgePattern {
    public static void main(String[] args) {
        Implementation concreteImplementation = new ConcreteImplementation1();
        Abstraction clientAbstraction = new Abstraction(concreteImplementation);
        // usually, client is only interested in working with the abstraction
        clientAbstraction.feature1();
        clientAbstraction.feature2();
    }
}
