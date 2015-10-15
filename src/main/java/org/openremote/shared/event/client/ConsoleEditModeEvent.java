package org.openremote.shared.event.client;

import com.google.gwt.core.client.js.JsType;
import org.openremote.shared.event.Event;

@JsType
public class ConsoleEditModeEvent extends Event {

    public boolean editMode;

    public ConsoleEditModeEvent() {
    }

    public ConsoleEditModeEvent(boolean editMode) {
        this.editMode = editMode;
    }

    public boolean isEditMode() {
        return editMode;
    }
}
