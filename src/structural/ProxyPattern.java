package structural;

/**
 * Represents the service's interface, which the proxy must follow to disguise
 * itself as a service object.
 */
interface ServiceInterface {
    public void operation();
}

/**
 * Represents a service that provides some useful business logic.
 */
class Service implements ServiceInterface {
    @Override
    public void operation() {
    }
}

/**
 * Represents a proxy that has a service object. After it finishes processing,
 * it passes the request to the service object. Processing can be anything
 * that checks if the request should be delegated to the real service or not.
 */
class Proxy implements ServiceInterface {
    private Service realService;

    public Proxy(Service s) {
        realService = s;
    }

    public boolean checkAccess() {
        return true; // would normally have logic to determine this
    }

    @Override
    public void operation() {
        if (checkAccess()) {
            realService.operation(); // delegate when necessary
        }
    }
}

/**
 * Example usage of the proxy design pattern.
 */
class ProxyPattern {
    public static void main(String[] args) {
        Service service = new Service();
        Proxy proxy = new Proxy(service);

        // client should interact with the proxy instead of the real service
        proxy.operation();
    }
}
