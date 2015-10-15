package org.openremote.shared.func;

import com.google.gwt.core.client.js.JsFunction;

@JsFunction
public interface Function<T, R> {
    R apply(T t);
}
