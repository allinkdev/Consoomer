package com.github.allinkdev.consoomer.functions;

@FunctionalInterface
public interface NovemFunction<T, U, V, W, X, Y, Z, A, B, C> {
    C accept(T t, U u, V v, W w, X x, Y y, Z z, A a, B b);
}
