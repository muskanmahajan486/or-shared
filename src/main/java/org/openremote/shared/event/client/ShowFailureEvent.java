package org.openremote.shared.event.client;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import org.openremote.shared.event.Event;

@JsType
public class ShowFailureEvent extends Event {

    public static final int DURABLE = 9999999; // 7 days...

    public String text;
    public int durationMillis;

    @JsIgnore
    public ShowFailureEvent() {
    }

    @JsIgnore
    public ShowFailureEvent(String text) {
        this(text, DURABLE);
    }

    @JsIgnore
    public ShowFailureEvent(String text, int durationMillis) {
        this.text = text;
        this.durationMillis = durationMillis;
    }

    public String getText() {
        return text;
    }

    public int getDurationMillis() {
        return durationMillis;
    }
}
