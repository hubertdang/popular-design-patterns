package creational;

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

/**
 * Represents a builder that provides specific implementations of the
 * construction steps to make a Product1.
 */
class ChineseBuilder implements Builder {
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

/**
 * Represents a builder that provides specific implementations of the
 * construction steps to make a Product2.
 */
class VietnameseBuilder implements Builder {
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

/**
 * Represents a product that is constructed in China.
 */
class ProductMadeInChina {
    public ProductMadeInChina() {
    }

    public void doThis() {
    }

    public void doThat() {
    }

    public void doSomethingElse() {
    }
}

/**
 * Represents a product that is constructed in Vietnam.
 */
class ProductMadeInVietnam {
    public ProductMadeInVietnam() {
    }

    public void doThisThing() {
    }

    public void doSomeStuff() {
    }

    public void doSomethingOriginal() {
    }
}

/**
 * Represents a director that defines the order in which to execute building
 * steps, while the builder provies the implementation for those steps.
 */
class Director {
    /**
     * Makes a product of variant A using a specific builder.
     * 
     * @param builder The builder that will build the product of variant A.
     */
    public void makeProductVariantA(Builder builder) {
        builder.reset();
        builder.buildStepA();
        builder.buildStepZ();

        if (1 < 5) {
            builder.buildStepB();
        }
    }

    /**
     * Makes a product of variant B using a specific builder.
     * 
     * @param builder The builder that will build the product of variant B.
     */
    public void makeProductVariantB(Builder builder) {
        builder.reset();
        builder.buildStepZ();
        builder.buildStepB();
        builder.buildStepA();
    }
}

/**
 * Example usage of the builder design pattern.
 */
class BuilderPattern {
    public static void main(String[] args) {
        Director director = new Director();
        ChineseBuilder wei = new ChineseBuilder();
        VietnameseBuilder duong = new VietnameseBuilder();

        // we can make different products with different builders
        director.makeProductVariantA(wei);
        ProductMadeInChina chineseProductVariantA = wei.getResult();

        director.makeProductVariantA(duong);
        ProductMadeInVietnam vietnameseProductVariantA = duong.getResult();

        director.makeProductVariantB(wei);
        ProductMadeInChina chineseProductVariantB = wei.getResult();

        director.makeProductVariantB(duong);
        ProductMadeInVietnam vietnameseProductVariantB = duong.getResult();
    }
}