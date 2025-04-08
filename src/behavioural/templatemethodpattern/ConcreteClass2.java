package behavioural.templatemethodpattern;

/**
 * Represents a concrete class that has implemented the variant steps of the
 * abstract class, and overriden invariant steps, but still executes the same
 * template algorithm.
 */
public class ConcreteClass2 extends AbstractClass {
    @Override
    public void step1() {
        System.out.println("ConcreteClass1's overriden implementation of step1");
    }

    @Override
    public boolean step2() {
        return false;
    }

    @Override
    public void step3() {
        System.out.println("ConcreteClass1's implementation of step3");
    }

    @Override
    public void step4() {
        System.out.println("ConcreteClass1's implementation of step4");
    }
}
