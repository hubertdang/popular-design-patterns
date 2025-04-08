package structural.adapterpattern;

/**
 * Represents some useful class that the client can't use directly because it
 * has an incompatible interface (probably because it's a 3rd-party or legacy
 * class).
 */
public class Service {
    public Object serviceMethod(Object specialData) {
        Object someObject = new Object();
        return someObject;
    }
}