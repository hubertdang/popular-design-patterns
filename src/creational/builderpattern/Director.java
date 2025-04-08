package creational.builderpattern;

/**
 * Represents a director that defines the order in which to execute building
 * steps, while the builder provies the implementation for those steps.
 */
public class Director {
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
