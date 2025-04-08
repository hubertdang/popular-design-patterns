package creational.singletonpattern;

/**
 * Example usage of the singleton design pattern.
 */
public class SingletonPattern {
    public static void main(String[] args) {
        Singleton singletonInstance = Singleton.getInstance();

        if (Singleton.getInstance() == singletonInstance) {
            System.out.println("Singleton.getInstance() should return the same instance.");
        }
    }
}
