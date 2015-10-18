package org.openremote.shared.inventory;

public class Adapter extends InventoryObject {

    protected String discoveryEndpoint;

    protected Adapter() {
    }

    public Adapter(String label, String id, String type) {
        super(label, id, type);
    }

    public Adapter(String label, String id, String type, String discoveryEndpoint) {
        super(label, id, type);
        this.label = label;
        this.discoveryEndpoint = discoveryEndpoint;
    }

    public String getDiscoveryEndpoint() {
        return discoveryEndpoint;
    }

    public void setDiscoveryEndpoint(String discoveryEndpoint) {
        this.discoveryEndpoint = discoveryEndpoint;
    }

    @Override
    public String toString() {
        return "Adapter{" +
            "discoveryEndpoint='" + discoveryEndpoint + '\'' +
            "} " + super.toString();
    }
}
