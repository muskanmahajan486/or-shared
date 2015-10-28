package org.openremote.shared.flow;

import com.google.gwt.core.client.js.JsType;
import org.openremote.shared.model.Identifiable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@JsType
@MappedSuperclass
public class FlowObject extends Identifiable {

    @Column(name = "LABEL", nullable = true)
    public String label;

    protected FlowObject() {
    }

    public FlowObject(String label, String id, String type) {
        super(id, type);
        this.label = label;
    }

    public boolean isLabelEmpty() {
        return getLabel() == null || getLabel().length() == 0;
    }

    public String getDefaultedLabel() {
        return isLabelEmpty() ? "Unnamed " + getClass().getSimpleName(): getLabel();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
            "label='" + getLabel() + '\'' +
            ", id=" + getId() +
            '}';
    }

}
