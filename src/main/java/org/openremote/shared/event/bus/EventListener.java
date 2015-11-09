package org.openremote.shared.event.bus;

import jsinterop.annotations.JsFunction;
import org.openremote.shared.event.Event;

@JsFunction
public interface EventListener<E extends Event> {
    void on(E event);
}
