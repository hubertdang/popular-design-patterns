package structural;

/**
 * Represents a common interface for both wrappers and wrapper objects.
 */
interface Component {
    public void execute();
}

/**
 * Represents a class of objects that can be wrapped. It defines the core
 * functionality, which can be altered by wrappers (decorators).
 */
class ConcreteComponent implements Component {
    @Override
    public void execute() {
    }
}

/**
 * Represents a base decorator, which is a wrapper that adds ZERO functionality
 * to the wrappee. The base decorator delegates all operation to the wrappee.
 * It must implement the Component interface to ensure it contains the same set
 * of methods as the wrappee.
 */
class BaseDecorator implements Component {
    private Component wrappee;

    public BaseDecorator(Component c) {
        wrappee = c;
    }

    @Override
    public void execute() {
        wrappee.execute(); // delegation
    }
}

/**
 * Represents a decorator that defines extra functionality that can be added to
 * components dynamically (can't do that with inheritance).
 */
class ConcreteDecorator1 extends BaseDecorator {
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

/**
 * Represents another decorator that defines extra functionality that can be
 * added to components dynamically (can't do that with inheritance).
 */
class ConcreteDecorator2 extends BaseDecorator {
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

/**
 * Example usage of the decorator design pattern.
 */
class DecoratorPattern {
    public static void main(String[] args) {
        ConcreteComponent xmasTree = new ConcreteComponent();
        ConcreteDecorator1 xmasTreeWithLights = new ConcreteDecorator1(xmasTree);

        boolean weWantOrnaments = true;

        // we can add functionality to something at run time (can't with inheritance)
        ConcreteDecorator2 xmasTreeWithLightsAndOrnaments;

        if (weWantOrnaments) {
            xmasTreeWithLightsAndOrnaments = new ConcreteDecorator2(xmasTreeWithLights);
            xmasTreeWithLightsAndOrnaments.execute(); // executes with lights & ornaments
        } else {
            xmasTreeWithLights.execute(); // executes with lights only
        }
    }
}
