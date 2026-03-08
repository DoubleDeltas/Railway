package com.doubledeltas.railway.core.async;

public abstract class CoroutineBase<T, R> implements Coroutine<T, R> {
    abstract protected CoroutineWalker getWalker();
}
