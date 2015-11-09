package org.openremote.shared.event.client;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import org.openremote.shared.event.Event;

@JsType
public class ConsoleLoopDetectedEvent extends Event {

    public String nodeId;
    public String nodeLabel;

    @JsIgnore
    public ConsoleLoopDetectedEvent() {
    }

    @JsIgnore
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
