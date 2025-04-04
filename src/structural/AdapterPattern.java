package structural;

/**
 * Represents a client that contains the existing business logic of the
 * program.
 */
class Client {
    public void doSomething() {
        Service thirdPartyService = new Service(); // incompatible with client
        Adapter thirdPartyServiceAdapter = new Adapter(thirdPartyService);

        Object clientData = new Object();
        thirdPartyServiceAdapter.method(clientData);
    }
}

/**
 * Represents a protocol that other classes must follow to be able to
 * collaborate with the client code. Clients use this.
 */
interface ClientInterface {
    public Object method(Object data);
}

/**
 * Represents some useful class that the client can't use directly because it
 * has an incompatible interface (probably because it's a 3rd-party or legacy
 * class).
 */
class Service {
    public Object serviceMethod(Object specialData) {
        Object someObject = new Object();
        return someObject;
    }
}

/**
 * Represents an adapter that receives calls from the client interface and
 * translates them into calls tot he wrapped service object in a format it can
 * understand.
 */
class Adapter implements ClientInterface {
    private Service adapatee;

    Adapter(Service adaptee) {
        this.adapatee = adaptee;
    }

    @Override
    public Object method(Object data) {
        Object specialData = convertToServiceFormat(data);
        return adapatee.serviceMethod(specialData);
    }

    private Object convertToServiceFormat(Object data) {
        Object specialData = new Object(); 
        // do stuff here to convert the data to service format
        return specialData;
    }
}

/**
 * Example usage of the adapter design pattern.
 */
class AdapterPattern  {
    public static void main(String[] args) {
        Client client = new Client();
        client.doSomething();
    }
}
