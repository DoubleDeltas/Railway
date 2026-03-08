package com.doubledeltas.railway.core.async;

@FunctionalInterface
public interface CoroutineChainer<T, R> {
    CoroutineLink<R> chain(CoroutineLink<T> link);
}
