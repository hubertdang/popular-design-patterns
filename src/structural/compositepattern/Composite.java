package structural.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a composite component of a tree. It is a complex element and may
 * contain sub-elements. It has no knowledge of whether its children are leaf
 * or composite components.
 */
public class Composite implements Component {
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
