package behavioural.templatemethodpattern;

/**
 * Represents a concrete class that has implemented the variant steps of the
 * abstract class, but still executes the same template algorithm.
 */
public class ConcreteClass1 extends AbstractClass {
    @Override
    public void step3() {
        System.out.println("ConcreteClass2's implementation of step3");
    }

    @Override
    public void step4() {
        System.out.println("ConcreteClass2's implementation of step4");
    }
}
