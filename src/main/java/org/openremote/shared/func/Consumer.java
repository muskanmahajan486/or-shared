package org.openremote.shared.func;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface Consumer<T> {
    void accept(T t);
}
