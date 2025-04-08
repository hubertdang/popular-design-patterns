package behavioural.templatemethodpattern;

/**
 * Represents a class that declares methods that acts as steps of an algorithm,
 * as well as the actual template method which calls these methods in a
 * specific order. The steps may either be declared as abstract or have some
 * default implementation.
 */
public abstract class AbstractClass {
    public void templateMethod() {
        step1();

        if (step2()) {
            step3();
        } else {
            step4();
        }
    }

    public void step1() {
    }

    public boolean step2() {
        return true;
    }

    /**
     * A variant step in the algorithm that must be implemented.
     */
    public abstract void step3();

    /**
     * Another variant step in the algorithm that must be implemented.
     */
    public abstract void step4();
}
