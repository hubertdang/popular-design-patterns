package creational.builderpattern;

/**
 * Represents a builder that has product construction steps common to all types
 * of builders. Each builder constructs a product. The products are all similar
 * to each other at their core, but can be heavily customized.
 */
public interface Builder {
    public void reset();

    public void buildStepA();

    public void buildStepB();

    public void buildStepZ();
}