package com.github.allinkdev.consoomer.consumers;

@FunctionalInterface
public interface QuinqConsumer<T, U, V, W, X> {
    void accept(T t, U u, V v, W w, X x);
}
