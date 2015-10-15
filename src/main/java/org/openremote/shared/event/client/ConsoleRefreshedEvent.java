package org.openremote.shared.event.client;

import com.google.gwt.core.client.js.JsType;
import org.openremote.shared.event.Event;

@JsType
public class ConsoleRefreshedEvent extends Event {

    public boolean renderedWidgets;

    public ConsoleRefreshedEvent() {
    }

    public ConsoleRefreshedEvent(boolean renderedWidgets) {
        this.renderedWidgets = renderedWidgets;
    }

    public boolean isRenderedWidgets() {
        return renderedWidgets;
    }
}
