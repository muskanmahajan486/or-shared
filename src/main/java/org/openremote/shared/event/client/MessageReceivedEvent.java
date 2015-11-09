package org.openremote.shared.event.client;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import org.openremote.shared.event.Event;
import org.openremote.shared.event.Message;

@JsType
public class MessageReceivedEvent extends Event {

    public Message message;

    @JsIgnore
    public MessageReceivedEvent() {
    }

    @JsIgnore
    public MessageReceivedEvent(Message message) {
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }
}
