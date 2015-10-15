package org.openremote.shared.event;

import com.google.gwt.core.client.js.JsType;

@JsType
public class FlowRequestStatusEvent extends FlowIdEvent {

    // TODO This should probably be synchronous or we can't really correlate a "NOT FOUND" response

    public FlowRequestStatusEvent() {
    }

    public FlowRequestStatusEvent(String flowId) {
        super(flowId);
    }

}
