package org.openremote.shared.event;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;

@JsType
public class FlowRuntimeFailureEvent extends FlowIdEvent {

    public String message;
    public String nodeId;

    @JsIgnore
    protected FlowRuntimeFailureEvent() {
        this(null, null);
    }

    @JsIgnore
    public FlowRuntimeFailureEvent(String flowId, String message) {
        this(flowId, message, null);
    }

    @JsIgnore
    public FlowRuntimeFailureEvent(String flowId, String message, String nodeId) {
        super(flowId);
        this.message = message;
        this.nodeId = nodeId;
    }

    public String getMessage() {
        return message;
    }

    public String getNodeId() {
        return nodeId;
    }

}
