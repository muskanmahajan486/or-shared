package org.openremote.shared.event;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;

@JsType
public class FlowStatusEvent extends FlowIdEvent {

    public FlowDeploymentPhase phase;

    @JsIgnore
    protected FlowStatusEvent() {
    }

    @JsIgnore
    public FlowStatusEvent(String flowId, FlowDeploymentPhase phase) {
        super(flowId);
        this.phase = phase;
    }

    public FlowDeploymentPhase getPhase() {
        return phase;
    }
}
