package com.github.allinkdev.consoomer.functions;

@FunctionalInterface
public interface SexFunction<T, U, V, W, X, Y, Z> {
    Z accept(T t, U u, V v, W w, X x, Y y, Z z);
}
