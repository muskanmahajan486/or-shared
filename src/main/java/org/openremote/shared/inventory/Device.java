package org.openremote.shared.inventory;

import org.openremote.shared.model.Identifier;

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

    public Device(String label, Identifier primary) {
        this(label, primary, new Identifier[0], null);
    }


    public Device(String label, Identifier primary, Device parent) {
        this(label, primary, new Identifier[0], parent);
    }

    public Device(String label, Identifier primary, Identifier[] secondaries) {
        this(label, primary, secondaries, null);
    }

    public Device(String label, Identifier primary, Identifier[] secondaries, Device parent) {
        super(label, primary, secondaries);
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
