package org.openremote.shared.event.client;

import com.google.gwt.core.client.js.JsType;
import org.openremote.shared.event.Event;
import org.openremote.shared.inventory.ClientPresetVariant;

@JsType
public class ShellReadyEvent extends Event {

    public ClientPresetVariant clientPresetVariant;

    public ShellReadyEvent() {
    }

    public ShellReadyEvent(ClientPresetVariant clientPresetVariant) {
        this.clientPresetVariant = clientPresetVariant;
    }

    public ClientPresetVariant getClientPresetVariant() {
        return clientPresetVariant;
    }
}
