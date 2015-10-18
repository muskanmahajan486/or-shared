package org.openremote.shared.inventory;

import org.openremote.shared.model.Identifiable;
import org.openremote.shared.model.Property;

import java.util.*;

public class InventoryObject extends Identifiable {

    public String label;

    public Map<String, Property> properties = new LinkedHashMap<>();

    protected InventoryObject() {
    }

    public InventoryObject(String label, String id, String type) {
        super(id, type);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Map<String, Property> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return "InventoryObject{" +
            "label='" + getLabel() + '\'' +
            ", id=" + getId() +
            ", properties=" + getProperties() +
            '}';
    }
}
