package structural.adapterpattern;

/**
 * Represents a client that contains the existing business logic of the
 * program.
 */
public class Client {
    public void doSomething() {
        Service thirdPartyService = new Service(); // incompatible with client
        Adapter thirdPartyServiceAdapter = new Adapter(thirdPartyService);

        Object clientData = new Object();
        thirdPartyServiceAdapter.method(clientData);
    }
}
