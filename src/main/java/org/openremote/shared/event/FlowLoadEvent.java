package org.openremote.shared.event;

import com.google.gwt.core.client.js.JsType;

@JsType
public class FlowLoadEvent extends FlowIdEvent {

    public FlowLoadEvent(String flowId) {
        super(flowId);
    }
}
