package org.openremote.shared.flow;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jsinterop.annotations.JsType;
import jsinterop.annotations.JsIgnore;
import org.openremote.shared.util.StringArrayConverter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsType
@Entity
@Table(name = "NODE")
public class Node extends FlowObject {

    public static final String TYPE_SUBFLOW = "urn:openremote:flow:node:subflow";
    public static final String TYPE_SUBFLOW_LABEL = "Subflow";

    public static final String TYPE_CONSUMER = "urn:openremote:flow:node:consumer";
    public static final String TYPE_CONSUMER_LABEL = "Sink";

    public static final String TYPE_PRODUCER = "urn:openremote:flow:node:producer";
    public static final String TYPE_PRODUCER_LABEL = "Source";

    @Transient
    public Slot[] slots = new Slot[0];

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FLOW_ID", nullable = false, foreignKey = @ForeignKey(name = "FK_NODE_FLOW_ID"))
    @org.hibernate.annotations.OnDelete(
        action = org.hibernate.annotations.OnDeleteAction.CASCADE
    )
    @JsIgnore
    @JsonIgnore
    public Flow flow;

    // TODO Should this be FK constrained?
    @Column(name = "SUBFLOW_ID", nullable = true)
    public String subflowId;

    @Column(name = "CLIENT_ACCESS", nullable = false)
    public boolean clientAccess;

    @Column(name = "CLIENT_WIDGET", nullable = false)
    public boolean clientWidget;

    @Column(name = "ROUTE_PRE_ENDPOINT", nullable = true)
    public String preEndpoint;

    @Column(name = "ROUTE_POST_ENDPOINT", nullable = true)
    public String postEndpoint;

    @Embedded
    public EditorSettings editorSettings = new EditorSettings();

    @Column(name = "NODE_PROPERTIES", nullable = true, length = 1048576) // TODO 1MB?
    public String properties;

    @Column(name = "PERSISTENT_PROPERTY_PATHS", nullable = true)
    @Convert(converter = StringArrayConverter.class)
    public String[] persistentPropertyPaths;

    @JsIgnore
    protected Node() {
    }

    @JsIgnore
    public Node(String label, String id, String type) {
        super(label, id, type);
    }

    @JsIgnore
    public Node(String label, String id, String type, String subflowId) {
        super(label, id, type);
        if (!isOfTypeSubflow()) {
            throw new IllegalArgumentException(
                "Node with subflow identifier must be of type: " + TYPE_SUBFLOW
            );
        }
        this.subflowId = subflowId;
    }

    public boolean isOfTypeSubflow() {
        return isOfType(TYPE_SUBFLOW);
    }

    public boolean isOfTypeConsumerOrProducer() {
        return isOfType(TYPE_CONSUMER) || isOfType(TYPE_PRODUCER);
    }

    public String getSubflowId() {
        return subflowId;
    }

    public void setSubflowId(String subflowId) {
        this.subflowId = subflowId;
    }

    public Slot[] getSlots() {
        return slots;
    }

    public void setSlots(Slot[] slots) {
        this.slots = slots;
    }

    public boolean isClientAccess() {
        return clientAccess;
    }

    public void setClientAccess(boolean clientAccess) {
        this.clientAccess = clientAccess;
    }

    public boolean isClientWidget() {
        return clientWidget;
    }

    public void setClientWidget(boolean clientWidget) {
        this.clientWidget = clientWidget;
    }

    public String getPreEndpoint() {
        return preEndpoint;
    }

    public void setPreEndpoint(String preEndpoint) {
        this.preEndpoint = preEndpoint;
    }

    public String getPostEndpoint() {
        return postEndpoint;
    }

    public void setPostEndpoint(String postEndpoint) {
        this.postEndpoint = postEndpoint;
    }

    public EditorSettings getEditorSettings() {
        return editorSettings;
    }

    public void setEditorSettings(EditorSettings editorSettings) {
        this.editorSettings = editorSettings;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String[] getPersistentPropertyPaths() {
        return persistentPropertyPaths;
    }

    public void setPersistentPropertyPaths(String[] persistentPropertyPaths) {
        this.persistentPropertyPaths = persistentPropertyPaths;
    }

    public void addSlots(Slot... newSlots) {
        List<Slot> list = new ArrayList<>();
        list.addAll(Arrays.asList(getSlots()));
        list.addAll(Arrays.asList(newSlots));
        setSlots(list.toArray(new Slot[list.size()]));
    }

    public Slot findSlot(String slotId) {
        for (Slot slot : getSlots()) {
            if (slot.getId().equals(slotId))
                return slot;
        }
        return null;
    }

    public Slot[] findSlots(String type) {
        List<Slot> list = new ArrayList<>();
        for (Slot slot : getSlots()) {
            if (slot.isOfType(type))
                list.add(slot);
        }
        return list.toArray(new Slot[list.size()]);
    }

    public Slot findSlotWithPeer(String peerId) {
        for (Slot slot : getSlots()) {
            if (slot.getPeerId() != null && slot.getPeerId().equals(peerId))
                return slot;
        }
        return null;
    }

    public Slot[] findAllConnectableSlots() {
        return findConnectableSlots(null);
    }

    public Slot[] findConnectableSlots(String type) {
        List<Slot> list = new ArrayList<>();
        for (Slot slot : getSlots()) {
            if ((type == null || slot.isOfType(type)) && slot.isConnectable())
                list.add(slot);
        }
        return list.toArray(new Slot[list.size()]);
    }

    public Slot[] findNonPropertySlots(String type) {
        List<Slot> list = new ArrayList<>();
        for (Slot slot : getSlots()) {
            if (slot.isOfType(type) && slot.getPropertyPath() == null)
                list.add(slot);
        }
        return list.toArray(new Slot[list.size()]);
    }

    public Slot[] findPropertySlots() {
        List<Slot> list = new ArrayList<>();
        for (Slot slot : getSlots()) {
            if (slot.getPropertyPath() != null)
                list.add(slot);
        }
        return list.toArray(new Slot[list.size()]);
    }

    public Slot findSlotByPosition(int position, String type) {
        if (position > getSlots().length - 1)
            return null;
        if (getSlots()[position].isOfType(type))
            return getSlots()[position];
        return null;
    }
}
