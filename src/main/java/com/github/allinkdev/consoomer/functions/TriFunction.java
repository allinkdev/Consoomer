package com.github.allinkdev.consoomer.functions;

@FunctionalInterface
public interface TriFunction<T, U, V, W> {
    W accept(T t, U u, V v);
}
