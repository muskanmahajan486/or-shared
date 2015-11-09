package org.openremote.shared.event.client;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import org.openremote.shared.event.FlowEvent;
import org.openremote.shared.flow.Flow;

@JsType
public class ConsoleRefreshEvent extends FlowEvent {

    public String selectedNodeId;

    @JsIgnore
    public ConsoleRefreshEvent() {
        this(null, null);
    }

    @JsIgnore
    public ConsoleRefreshEvent(Flow flow) {
        this(flow, null);
    }

    @JsIgnore
    public ConsoleRefreshEvent(Flow flow, String selectedNodeId) {
        super(flow);
        this.selectedNodeId = selectedNodeId;
    }

    public String getSelectedNodeId() {
        return selectedNodeId;
    }
}
