package org.openremote.shared.event.client;

import com.google.gwt.core.client.js.JsType;
import org.openremote.shared.event.Event;

@JsType
public class ConsoleZoomEvent extends Event {

    public double zoomFactor;

    public ConsoleZoomEvent() {
    }

    public ConsoleZoomEvent(double zoomFactor) {
        this.zoomFactor = zoomFactor;
    }

    public double getZoomFactor() {
        return zoomFactor;
    }
}
