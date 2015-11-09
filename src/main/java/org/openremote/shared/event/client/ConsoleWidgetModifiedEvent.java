package org.openremote.shared.event.client;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import org.openremote.shared.event.Event;

@JsType
public class ConsoleWidgetModifiedEvent extends Event {

    public String nodeId;
    public String nodeProperties;

    @JsIgnore
    public ConsoleWidgetModifiedEvent() {
    }

    @JsIgnore
    public ConsoleWidgetModifiedEvent(String nodeId, String nodeProperties) {
        this.nodeId = nodeId;
        this.nodeProperties = nodeProperties;
    }

    public String getNodeId() {
        return nodeId;
    }

    public String getNodeProperties() {
        return nodeProperties;
    }
}