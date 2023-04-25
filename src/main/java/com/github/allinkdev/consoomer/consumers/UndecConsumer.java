package com.github.allinkdev.consoomer.consumers;

@FunctionalInterface
public interface UndecConsumer<T, U, V, W, X, Y, Z, A, B, C, D> {
    void accept(T t, U u, V v, X x, Y y, Z z, A a, B b, C c, D d);
}
