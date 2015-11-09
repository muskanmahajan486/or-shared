package org.openremote.shared.event;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;

@JsType
public class FlowStopEvent extends FlowIdEvent {

    @JsIgnore
    protected FlowStopEvent() {
    }

    @JsIgnore
    public FlowStopEvent(String flowId) {
        super(flowId);
    }

}
