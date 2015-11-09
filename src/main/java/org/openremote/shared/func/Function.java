package org.openremote.shared.func;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface Function<T, R> {
    R apply(T t);
}
