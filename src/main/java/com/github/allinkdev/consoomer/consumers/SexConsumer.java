package com.github.allinkdev.consoomer.consumers;

@FunctionalInterface
public interface SexConsumer<T, U, V, W, X, Y> {
    void accept(T t, U u, V v, W w, X x, Y y);
}
