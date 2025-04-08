package structural.adapterpattern;

/**
 * Represents an adapter that receives calls from the client interface and
 * translates them into calls tot he wrapped service object in a format it can
 * understand.
 */
public class Adapter implements ClientInterface {
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
