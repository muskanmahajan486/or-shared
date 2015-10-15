package org.openremote.shared.event.client;

import com.google.gwt.core.client.js.JsType;
import org.openremote.shared.event.Event;
import org.openremote.shared.event.Message;

@JsType
public class MessageSendEvent extends Event {

    public Message message;

    public MessageSendEvent() {
    }

    public MessageSendEvent(Message message) {
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }
}
