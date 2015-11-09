package org.openremote.shared.event.client;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import org.openremote.shared.event.Event;

@JsType
public class ShowInfoEvent extends Event {

    public String text;

    @JsIgnore
    public ShowInfoEvent() {
    }

    @JsIgnore
    public ShowInfoEvent(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
