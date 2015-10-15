package org.openremote.shared.event;

import com.google.gwt.core.client.js.JsType;

@JsType
public class FlowStatusEvent extends FlowIdEvent {

    public FlowDeploymentPhase phase;

    protected FlowStatusEvent() {
    }

    public FlowStatusEvent(String flowId, FlowDeploymentPhase phase) {
        super(flowId);
        this.phase = phase;
    }

    public FlowDeploymentPhase getPhase() {
        return phase;
    }
}
