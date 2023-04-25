package com.github.allinkdev.consoomer.functions;

@FunctionalInterface
public interface OctoFunction<T, U, V, W, X, Y, Z, A, B> {
    B accept(T t, U u, V v, W w, X x, Y y, Z z, A a);
}
