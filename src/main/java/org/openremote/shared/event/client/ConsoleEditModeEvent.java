package org.openremote.shared.event.client;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import org.openremote.shared.event.Event;

@JsType
public class ConsoleEditModeEvent extends Event {

    public boolean editMode;

    @JsIgnore
    public ConsoleEditModeEvent() {
    }

    @JsIgnore
    public ConsoleEditModeEvent(boolean editMode) {
        this.editMode = editMode;
    }

    public boolean isEditMode() {
        return editMode;
    }
}
