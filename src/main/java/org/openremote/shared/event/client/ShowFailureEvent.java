package org.openremote.shared.event.client;

import com.google.gwt.core.client.js.JsType;
import org.openremote.shared.event.Event;

@JsType
public class ShowFailureEvent extends Event {

    public static final int DURABLE = 9999999; // 7 days...

    public String text;
    public int durationMillis;

    public ShowFailureEvent() {
    }

    public ShowFailureEvent(String text) {
        this(text, DURABLE);
    }

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
