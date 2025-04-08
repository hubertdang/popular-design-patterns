package structural.compositepattern;

/**
 * Represents a leaf component of a tree. It is a basic element and has no
 * sub-elements.
 */
public class Leaf implements Component {
    @Override
    public void execute() {
        System.out.println("leaf executing!");
    }
}
