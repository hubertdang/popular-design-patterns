package structural.decoratorpattern;

/**
 * Example usage of the decorator design pattern.
 */
public class DecoratorPattern {
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