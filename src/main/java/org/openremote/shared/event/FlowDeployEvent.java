package org.openremote.shared.event;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;

@JsType
public class FlowDeployEvent extends FlowIdEvent {

    @JsIgnore
    protected FlowDeployEvent() {
    }

    @JsIgnore
    public FlowDeployEvent(String flowId) {
        super(flowId);
    }

}
