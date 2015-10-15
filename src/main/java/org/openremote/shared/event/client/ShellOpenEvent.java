package org.openremote.shared.event.client;

import com.google.gwt.core.client.js.JsType;
import org.openremote.shared.event.FlowEvent;
import org.openremote.shared.flow.Flow;

@JsType
public class ShellOpenEvent extends FlowEvent {

    public ShellOpenEvent() {
    }

    public ShellOpenEvent(Flow flow) {
        super(flow);
    }
}
