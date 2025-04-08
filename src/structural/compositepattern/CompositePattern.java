package structural.compositepattern;

/**
 * Example usage of the composite design pattern.
 */
public class CompositePattern {
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
