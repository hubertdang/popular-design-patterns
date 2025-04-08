package structural.adapterpattern;

/**
 * Represents a protocol that other classes must follow to be able to
 * collaborate with the client code. Clients use this.
 */
public interface ClientInterface {
    public Object method(Object data);
}
