package org.openremote.shared.event.client;

import com.google.gwt.core.client.js.JsType;
import org.openremote.shared.event.Event;

@JsType
public class ShowInfoEvent extends Event {

    public String text;

    public ShowInfoEvent() {
    }

    public ShowInfoEvent(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
