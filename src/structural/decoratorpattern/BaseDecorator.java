package structural.decoratorpattern;

/**
 * Represents a base decorator, which is a wrapper that adds ZERO functionality
 * to the wrappee. The base decorator delegates all operation to the wrappee.
 * It must implement the Component interface to ensure it contains the same set
 * of methods as the wrappee.
 */
public class BaseDecorator implements Component {
    private Component wrappee;

    public BaseDecorator(Component c) {
        wrappee = c;
    }

    @Override
    public void execute() {
        wrappee.execute(); // delegation
    }
}