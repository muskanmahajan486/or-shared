package org.openremote.shared.event.client;

import com.google.gwt.core.client.js.JsType;
import org.openremote.shared.event.Event;

@JsType
public class ConsoleLoopDetectedEvent extends Event {

    public String nodeId;
    public String nodeLabel;

    public ConsoleLoopDetectedEvent() {
    }

    public ConsoleLoopDetectedEvent(String nodeId, String nodeLabel) {
        this.nodeId = nodeId;
        this.nodeLabel = nodeLabel;
    }

    public String getNodeId() {
        return nodeId;
    }

    public String getNodeLabel() {
        return nodeLabel;
    }
}
