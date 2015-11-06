package org.openremote.shared.flow;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.gwt.core.client.js.JsType;
import org.openremote.shared.util.StringArrayConverter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_NULL;

@JsType
@JsonSerialize(include = NON_NULL)
@JsonAutoDetect(fieldVisibility = ANY, getterVisibility = NONE, setterVisibility = NONE, isGetterVisibility = NONE)
public class EditorSettings {

    @NotNull
    @Column(name = "EDITOR_TYPE_LABEL", nullable = false)
    public String typeLabel = "Unknown Type";

    @NotNull
    @Column(name = "EDITOR_NODE_COLOR", nullable = false)
    @Enumerated(EnumType.STRING)
    public NodeColor nodeColor = NodeColor.DEFAULT;

    @NotNull
    @Column(name = "EDITOR_POSITION_X", nullable = false)
    public double positionX;

    @NotNull
    @Column(name = "EDITOR_POSITION_Y", nullable = false)
    public double positionY;

    @Column(name = "EDITOR_COMPONENTS", nullable = true)
    @Convert(converter = StringArrayConverter.class)
    public String[] components;

    public EditorSettings() {
    }

    public EditorSettings(String typeLabel) {
        this.typeLabel = typeLabel;
    }

    public EditorSettings(String typeLabel, NodeColor nodeColor) {
        this.typeLabel = typeLabel;
        this.nodeColor = nodeColor;
    }

    public String getTypeLabel() {
        return typeLabel;
    }

    public void setTypeLabel(String typeLabel) {
        this.typeLabel = typeLabel;
    }

    public NodeColor getNodeColor() {
        return nodeColor;
    }

    public void setNodeColor(NodeColor nodeColor) {
        this.nodeColor = nodeColor;
    }

    public double getPositionX() {
        return positionX;
    }

    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }

    public String[] getComponents() {
        return components;
    }

    public void setComponents(String[] components) {
        this.components = components;
    }
}
