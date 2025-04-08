package structural.proxypattern;

/**
 * Represents a proxy that has a service object. After it finishes processing,
 * it passes the request to the service object. Processing can be anything
 * that checks if the request should be delegated to the real service or not.
 */
public class Proxy implements ServiceInterface {
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
