package org.openremote.shared.event;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import org.openremote.shared.flow.Flow;

@JsType
public abstract class FlowEvent extends Event {

    public Flow flow;

    @JsIgnore
    protected FlowEvent() {
    }

    @JsIgnore
    public FlowEvent(Flow flow) {
        this.flow = flow;
    }

    public Flow getFlow() {
        return flow;
    }

    public boolean matches(Flow other) {
        return other != null && other.getId().equals(flow.getId());
    }
}
