package org.openremote.shared.flow;

import com.google.gwt.core.client.js.JsType;

@JsType
public class Slot extends FlowObject {

    public static final String TYPE_SINK = "urn:openremote:flow:slot:sink";
    public static final String TYPE_SOURCE = "urn:openremote:flow:slot:source";

    public boolean connectable = true;
    public String peerId;
    public String propertyPath;

    protected Slot() {
    }

    public Slot(String id, String type) {
        super(null, id, type);
    }

    public Slot(String label, String id, String type) {
        this(label, id, type, null);
    }

    public Slot(String label, String id, String type, String propertyPath) {
        this(label, id, type, true, null, propertyPath);
    }

    public Slot(String id, String type, boolean connectable) {
        this(null, id, type, connectable);
    }

    public Slot(String label, String id, String type, boolean connectable) {
        this(label, id, type, connectable, null, null);
    }

    public Slot(String id, Slot peer, String label) {
        this(label, id, peer.getType(), true, peer.getId(), null);
    }

    public Slot(String label, String id, String type, boolean connectable, String peerId, String propertyPath) {
        super(label, id, type);
        this.connectable = connectable;
        this.peerId = peerId;
        this.propertyPath = propertyPath;
    }

    public boolean isConnectable() {
        return connectable;
    }

    public void setConnectable(boolean connectable) {
        this.connectable = connectable;
    }

    public String getPeerId() {
        return peerId;
    }

    public void setPeerId(String peerId) {
        this.peerId = peerId;
    }

    public String getPropertyPath() {
        return propertyPath;
    }

    public void setPropertyPath(String propertyPath) {
        this.propertyPath = propertyPath;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
            "label='" + getLabel() + '\'' +
            ", id=" + getId() +
            ", connectable=" + isConnectable() +
            ", peerId=" + getPeerId() +
            ", propertyPath=" + getPropertyPath() +
            '}';
    }
}
