package com.github.allinkdev.consoomer.consumers;

@FunctionalInterface
public interface DecemConsumer<T, U, V, W, X, Y, Z, A, B, C> {
    void accept(T t, U u, V v, W w, X x, Y y, Z z, A a, B b, C c);
}
