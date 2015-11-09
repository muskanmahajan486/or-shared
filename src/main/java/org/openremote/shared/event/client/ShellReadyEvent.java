package org.openremote.shared.event.client;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import org.openremote.shared.event.Event;
import org.openremote.shared.inventory.ClientPresetVariant;

@JsType
public class ShellReadyEvent extends Event {

    public ClientPresetVariant clientPresetVariant;

    @JsIgnore
    public ShellReadyEvent() {
    }

    @JsIgnore
    public ShellReadyEvent(ClientPresetVariant clientPresetVariant) {
        this.clientPresetVariant = clientPresetVariant;
    }

    public ClientPresetVariant getClientPresetVariant() {
        return clientPresetVariant;
    }
}
