package org.openremote.shared.event.client;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import org.openremote.shared.event.FlowEvent;
import org.openremote.shared.flow.Flow;

@JsType
public class SubflowNodeCreateEvent extends FlowEvent {

    public String subflowId;
    public double positionX;
    public double positionY;
    public boolean applyPositionAsProperties;

    @JsIgnore
    public SubflowNodeCreateEvent() {
    }

    @JsIgnore
    public SubflowNodeCreateEvent(Flow flow, String subflowId, double positionX, double positionY) {
        this(flow, subflowId, positionX, positionY, false);
    }

    @JsIgnore
    public SubflowNodeCreateEvent(Flow flow, String subflowId, double positionX, double positionY, boolean applyPositionAsProperties) {
        super(flow);
        this.subflowId = subflowId;
        this.positionX = positionX;
        this.positionY = positionY;
        this.applyPositionAsProperties = applyPositionAsProperties;
    }

    public String getSubflowId() {
        return subflowId;
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
