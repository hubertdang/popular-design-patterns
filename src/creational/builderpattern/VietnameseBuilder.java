package creational.builderpattern;

/**
 * Represents a builder that provides specific implementations of the
 * construction steps to make a Product2.
 */
public class VietnameseBuilder implements Builder {
    private ProductMadeInVietnam result;

    @Override
    public void reset() {
        result = new ProductMadeInVietnam();
    }

    @Override
    public void buildStepA() {
        result.doSomeStuff();
    }

    @Override
    public void buildStepB() {
        result.doSomethingOriginal();
    }

    @Override
    public void buildStepZ() {
        result.doThisThing();
    }

    public ProductMadeInVietnam getResult() {
        return this.result;
    }
}
