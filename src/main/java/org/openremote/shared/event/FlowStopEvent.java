package org.openremote.shared.event;

import com.google.gwt.core.client.js.JsType;

@JsType
public class FlowStopEvent extends FlowIdEvent {

    protected FlowStopEvent() {
    }

    public FlowStopEvent(String flowId) {
        super(flowId);
    }

}
