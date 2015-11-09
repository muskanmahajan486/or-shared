package org.openremote.shared.event;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import org.openremote.shared.flow.Flow;

@JsType
public abstract class FlowIdEvent extends Event {

    public String flowId;

    @JsIgnore
    protected FlowIdEvent() {
    }

    @JsIgnore
    public FlowIdEvent(String flowId) {
        this.flowId = flowId;
    }

    public String getFlowId() {
        return flowId;
    }

    public boolean matches(Flow other) {
        return other != null && other.getId().equals(getFlowId());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
            "flowId='" + flowId + '\'' +
            '}';
    }
}
