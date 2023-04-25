package com.github.allinkdev.consoomer.functions;

@FunctionalInterface
public interface DuodecFunction<T, U, V, W, X, Y, Z, A, B, C, D, E, F> {
    F accept(T t, U u, V v, W w, X x, Y y, Z z, A a, B b, C c, D d, E e);
}
