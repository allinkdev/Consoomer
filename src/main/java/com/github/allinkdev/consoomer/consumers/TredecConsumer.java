package com.github.allinkdev.consoomer.consumers;

@FunctionalInterface
public interface TredecConsumer<T, U, V, W, X, Y, Z, A, B, C, D, E, F> {
    void accept(T t, U u, V v, W w, X x, Y y, Z z, A a, B b, C c, D d, E e, F f);
}
