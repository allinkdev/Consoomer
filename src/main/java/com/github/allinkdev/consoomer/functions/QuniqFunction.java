package com.github.allinkdev.consoomer.functions;

@FunctionalInterface
public interface QuniqFunction<T, U, V, W, X, Y> {
    Y accept(T t, U u, V v, W w, X x);
}
