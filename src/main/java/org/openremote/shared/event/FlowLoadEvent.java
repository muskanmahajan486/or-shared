package org.openremote.shared.event;

import jsinterop.annotations.JsType;

@JsType
public class FlowLoadEvent extends FlowIdEvent {

    public FlowLoadEvent(String flowId) {
        super(flowId);
    }
}
