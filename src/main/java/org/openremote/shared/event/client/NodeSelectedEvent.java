package org.openremote.shared.event.client;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import org.openremote.shared.event.Event;

@JsType
public class NodeSelectedEvent extends Event {

    public String nodeId;

    @JsIgnore
    public NodeSelectedEvent() {
    }

    @JsIgnore
    public NodeSelectedEvent(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeId() {
        return nodeId;
    }
}
