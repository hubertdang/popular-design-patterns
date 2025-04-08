package structural.decoratorpattern;

/**
 * Represents a decorator that defines extra functionality that can be added to
 * components dynamically (can't do that with inheritance).
 */
public class ConcreteDecorator1 extends BaseDecorator {
    public ConcreteDecorator1(Component c) {
        super(c);
    }

    @Override
    public void execute() {
        super.execute();
        extraFunctionality(); // add new behaviour to basic execute()
    }

    public void extraFunctionality() {
    }
}
