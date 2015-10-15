package org.openremote.shared.event.client;

import com.google.gwt.core.client.js.JsType;
import org.openremote.shared.event.FlowEvent;
import org.openremote.shared.flow.Flow;

@JsType
public class ConsoleRefreshEvent extends FlowEvent {

    public String selectedNodeId;

    public ConsoleRefreshEvent() {
        this(null, null);
    }

    public ConsoleRefreshEvent(Flow flow) {
        this(flow, null);
    }

    public ConsoleRefreshEvent(Flow flow, String selectedNodeId) {
        super(flow);
        this.selectedNodeId = selectedNodeId;
    }

    public String getSelectedNodeId() {
        return selectedNodeId;
    }
}
