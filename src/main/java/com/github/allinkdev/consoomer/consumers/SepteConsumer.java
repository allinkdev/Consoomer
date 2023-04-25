package com.github.allinkdev.consoomer.consumers;

@FunctionalInterface
public interface SepteConsumer<T, U, V, W, X, Y, Z> {
    void accept(T t, U u, V v, W w, X x, Y y, Z z);
}
