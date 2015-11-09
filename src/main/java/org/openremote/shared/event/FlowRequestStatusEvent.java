package org.openremote.shared.event;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;

@JsType
public class FlowRequestStatusEvent extends FlowIdEvent {

    // TODO This should probably be synchronous or we can't really correlate a "NOT FOUND" response

    @JsIgnore
    public FlowRequestStatusEvent() {
    }

    @JsIgnore
    public FlowRequestStatusEvent(String flowId) {
        super(flowId);
    }

}
