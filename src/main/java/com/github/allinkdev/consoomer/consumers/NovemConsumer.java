package com.github.allinkdev.consoomer.consumers;

@FunctionalInterface
public interface NovemConsumer<T, U, V, W, X, Y, Z, A, B> {
    void accept(T t, U u, V v, W w, X x, Y y, Z z, A a, B b);
}
