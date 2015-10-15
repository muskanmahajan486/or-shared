package org.openremote.shared.func;

import com.google.gwt.core.client.js.JsFunction;

@JsFunction
public interface Consumer<T> {
    void accept(T t);
}
