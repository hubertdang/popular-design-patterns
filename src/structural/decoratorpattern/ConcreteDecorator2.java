package structural.decoratorpattern;

/**
 * Represents another decorator that defines extra functionality that can be
 * added to components dynamically (can't do that with inheritance).
 */
public class ConcreteDecorator2 extends BaseDecorator {
    public ConcreteDecorator2(Component c) {
        super(c);
    }

    @Override
    public void execute() {
        someMoreFunctionality(); // add new behaviour to basic execute()
        super.execute();
    }

    public void someMoreFunctionality() {
    }
}
