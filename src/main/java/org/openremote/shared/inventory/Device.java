package org.openremote.shared.inventory;

public class Device extends InventoryObject {

    public enum Status {
        UNINITIALIZED,
        INITIALIZING,
        ONLINE,
        OFFLINE,
        REMOVING,
        REMOVED,
        INITIALIZATION_ERROR,
        COMMUNICATION_ERROR,
        MAINTENANCE
    }

    protected Status status = Status.UNINITIALIZED;

    protected Device parent;

    protected Device() {
    }

    public Device(String label, String id, String type) {
        this(label, id, type, null);
    }

    public Device(String label, String id, String type, Device parent) {
        super(label, id, type);
        this.parent = parent;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Device getParent() {
        return parent;
    }

    public void setParent(Device parent) {
        this.parent = parent;
    }
}
