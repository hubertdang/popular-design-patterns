package creational.singletonpattern;

/**
 * Represents a singleton - a class that can have at most one instance at
 * any given time, accessible to clients from a well-known access point.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    /**
     * Provides access to the instance of the singleton. If the instance
     * has not already been instantiated, instanstiates it first.
     * 
     * @return The sole instance of the singleton.
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
