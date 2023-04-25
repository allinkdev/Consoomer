package com.github.allinkdev.consoomer.functions;

@FunctionalInterface
public interface SeptaFunction<T, U, V, W, X, Y, Z, A> {
    A accept(T t, U u, V v, W w, X x, Y y, Z z);
}
