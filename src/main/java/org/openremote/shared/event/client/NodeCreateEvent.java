package org.openremote.shared.event.client;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import org.openremote.shared.event.FlowEvent;
import org.openremote.shared.flow.Flow;

@JsType
public class NodeCreateEvent extends FlowEvent {

    public String nodeType;
    public double positionX;
    public double positionY;
    public boolean applyPositionAsProperties;

    @JsIgnore
    public NodeCreateEvent() {
    }

    @JsIgnore
    public NodeCreateEvent(Flow flow, String nodeType, double positionX, double positionY) {
        this(flow, nodeType, positionX, positionY, false);
    }

    @JsIgnore
    public NodeCreateEvent(Flow flow, String nodeType, double positionX, double positionY, boolean applyPositionAsProperties) {
        super(flow);
        this.nodeType = nodeType;
        this.positionX = positionX;
        this.positionY = positionY;
        this.applyPositionAsProperties = applyPositionAsProperties;
    }

    public String getNodeType() {
        return nodeType;
    }

    public double getPositionX() {
        return positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public boolean isApplyPositionAsProperties() {
        return applyPositionAsProperties;
    }
}
