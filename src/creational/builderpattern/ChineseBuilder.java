package creational.builderpattern;

/**
 * Represents a builder that provides specific implementations of the
 * construction steps to make a Product1.
 */
public class ChineseBuilder implements Builder {
    private ProductMadeInChina result;

    @Override
    public void reset() {
        result = new ProductMadeInChina();
    }

    @Override
    public void buildStepA() {
        result.doThis();
    }

    @Override
    public void buildStepB() {
        result.doThat();
    }

    @Override
    public void buildStepZ() {
        result.doSomethingElse();
    }

    public ProductMadeInChina getResult() {
        return this.result;
    }
}
