package creational.builderpattern;

/**
 * Example usage of the builder design pattern.
 */
public class BuilderPattern {
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
