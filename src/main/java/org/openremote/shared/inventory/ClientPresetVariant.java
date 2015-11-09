package org.openremote.shared.inventory;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;

@JsType
public class ClientPresetVariant {

    public String userAgent;
    public int widthPixels;
    public int heightPixels;

    @JsIgnore
    protected ClientPresetVariant() {
    }

    @JsIgnore
    public ClientPresetVariant(String userAgent, Integer widthPixels, Integer heightPixels) {
        this.userAgent = userAgent;
        this.widthPixels = widthPixels != null ? widthPixels : 0;
        this.heightPixels = heightPixels != null ? heightPixels : 0;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public int getWidthPixels() {
        return widthPixels;
    }

    public int getHeightPixels() {
        return heightPixels;
    }

    @Override
    public String toString() {
        return "PresetVariant{" +
            "userAgent='" + userAgent + '\'' +
            ", widthPixels=" + widthPixels +
            ", heightPixels=" + heightPixels +
            '}';
    }
}
