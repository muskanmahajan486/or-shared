package org.openremote.shared.event.client;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import org.openremote.shared.event.FlowEvent;
import org.openremote.shared.flow.Flow;

@JsType
public class ShellOpenEvent extends FlowEvent {

    @JsIgnore
    public ShellOpenEvent() {
    }

    @JsIgnore
    public ShellOpenEvent(Flow flow) {
        super(flow);
    }
}
