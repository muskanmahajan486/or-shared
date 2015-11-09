package org.openremote.shared.event.client;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import org.openremote.shared.event.Event;

@JsType
public class ConsoleRefreshedEvent extends Event {

    public boolean renderedWidgets;

    @JsIgnore
    public ConsoleRefreshedEvent() {
    }

    @JsIgnore
    public ConsoleRefreshedEvent(boolean renderedWidgets) {
        this.renderedWidgets = renderedWidgets;
    }

    public boolean isRenderedWidgets() {
        return renderedWidgets;
    }
}
