package structural.proxypattern;

/**
 * Example usage of the proxy design pattern.
 */
public class ProxyPattern {
    public static void main(String[] args) {
        Service service = new Service();
        Proxy proxy = new Proxy(service);

        // client should interact with the proxy instead of the real service
        proxy.operation();
    }
}
