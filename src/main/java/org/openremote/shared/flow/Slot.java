package org.openremote.shared.flow;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsIgnore;

import javax.persistence.*;

@JsType
@Entity
@Table(name = "SLOT")
public class Slot extends FlowObject {

    public static final String TYPE_SINK = "urn:openremote:flow:slot:sink";
    public static final String TYPE_SOURCE = "urn:openremote:flow:slot:source";

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NODE_ID", nullable = false, foreignKey = @ForeignKey(name = "FK_SLOT_NODE_ID"))
    @org.hibernate.annotations.OnDelete(
        action = org.hibernate.annotations.OnDeleteAction.CASCADE
    )
    @JsIgnore
    @JsonIgnore
    public Node node;

    @Column(name = "CONNECTABLE", nullable = false)
    public boolean connectable = true;

    @Column(name = "PEER_ID", nullable = true)
    public String peerId;

    @Column(name = "PROPERTY_PATH", nullable = true)
    public String propertyPath;

    @JsIgnore
    protected Slot() {
    }

    @JsIgnore
    public Slot(String id, String type) {
        super(null, id, type);
    }

    @JsIgnore
    public Slot(String label, String id, String type) {
        this(label, id, type, null);
    }

    @JsIgnore
    public Slot(String label, String id, String type, String propertyPath) {
        this(label, id, type, true, null, propertyPath);
    }

    @JsIgnore
    public Slot(String id, String type, boolean connectable) {
        this(null, id, type, connectable);
    }

    @JsIgnore
    public Slot(String label, String id, String type, boolean connectable) {
        this(label, id, type, connectable, null, null);
    }

    @JsIgnore
    public Slot(String id, Slot peer, String label) {
        this(label, id, peer.getType(), true, peer.getId(), null);
    }

    @JsIgnore
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
            ", type=" + getType() +
            ", connectable=" + isConnectable() +
            ", peerId=" + getPeerId() +
            ", propertyPath=" + getPropertyPath() +
            '}';
    }
}
