package org.openremote.shared.event.client;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import org.openremote.shared.event.Event;

@JsType
public class ConsoleZoomEvent extends Event {

    public double zoomFactor;

    @JsIgnore
    public ConsoleZoomEvent() {
    }

    @JsIgnore
    public ConsoleZoomEvent(double zoomFactor) {
        this.zoomFactor = zoomFactor;
    }

    public double getZoomFactor() {
        return zoomFactor;
    }
}
