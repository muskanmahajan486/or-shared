package org.openremote.shared.event;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import org.openremote.shared.flow.Slot;

import java.util.Map;

@JsType
public class Message extends Event {

    public String slotId;
    public String instanceId;
    @JsIgnore
    public Map<String, Object> headers;
    public String body;

    @JsIgnore
    public Message() {
    }

    @JsIgnore
    public Message(Slot slot, String body) {
        this(slot.getId(), null, body, null);
    }

    @JsIgnore
    public Message(Slot slot, String instanceId, String body) {
        this(slot.getId(), instanceId, body, null);
    }

    @JsIgnore
    public Message(String slotId, String instanceId, String body, Map<String, Object> headers) {
        this.slotId = slotId;
        this.instanceId = instanceId;
        this.body = body;
        this.headers = headers;
    }

    public String getSlotId() {
        return slotId;
    }

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    @JsIgnore
    public Map<String, Object> getHeaders() {
        return headers;
    }

    @JsIgnore
    public void setHeaders(Map<String, Object> headers) {
        this.headers = headers;
    }

    public boolean hasHeaders() {
        return getHeaders() != null;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "MessageEvent{" +
            "slotId='" + slotId + '\'' +
            ", instanceId='" + instanceId + '\'' +
            ", headers=" + headers +
            ", body='" + body + '\'' +
            '}';
    }
}
