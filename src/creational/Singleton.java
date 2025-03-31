package creational;

import java.security.SignedObject;

/**
 * Represents a singleton - a class that can have at most one instance at
 * any given time, accessible to clients from a well-known access point.
 */
class Singleton {
    private static Singleton instance;

    private Singleton() {}

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

/**
 * Example usage of the singleton design pattern.
 */
class SingletonPattern {
    public static void main(String[] args) {
        Singleton singletonInstance = Singleton.getInstance();
        
        if (Singleton.getInstance() == singletonInstance) {
            System.out.println("Singleton.getInstance() should return the same instance.");
        }
    }
}