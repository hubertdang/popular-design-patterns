package structural;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an common interface for both leaf and composite components
 * of a tree.
 */
interface Component {
    public void execute();
}

/**
 * Represents a leaf component of a tree. It is a basic element and has no
 * sub-elements.
 */
class Leaf implements Component {
    @Override
    public void execute() {
        System.out.println("leaf executing!");
    }
}

/**
 * Represents a composite component of a tree. It is a complex element and may
 * contain sub-elements. It has no knowledge of whether its children are leaf
 * or composite components.
 */
class Composite implements Component {
    private List<Component> children = new ArrayList<>();

    public void add(Component c) {
        children.add(c);
    }

    public void remove(Component c) {
        children.remove(c);
    }

    public List<Component> getChildren() {
        return children;
    }

    @Override
    public void execute() {
        // delegate work to children
        for (Component child : children) {
            child.execute();
        }
    }
}

/**
 * Example usage of the composite design pattern.
 */
class CompositePattern {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();
        Leaf leaf3 = new Leaf();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite1.add(leaf2);
        composite1.add(leaf3);

        composite2.add(leaf1);
        composite2.add(composite1);

        /**
         * Visualization:
         * 
         * composite2 -> leaf1
         * -> composite1 -> leaf2
         * -> leaf3
         */

        composite2.execute();
    }
}
