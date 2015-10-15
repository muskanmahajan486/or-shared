package org.openremote.shared.event.client;

import com.google.gwt.core.client.js.JsType;
import org.openremote.shared.event.Event;

@JsType
public class NodeSelectedEvent extends Event {

    public String nodeId;

    public NodeSelectedEvent() {
    }

    public NodeSelectedEvent(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeId() {
        return nodeId;
    }
}
