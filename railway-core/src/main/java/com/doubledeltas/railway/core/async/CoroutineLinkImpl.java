package com.doubledeltas.railway.core.async;

import com.doubledeltas.railway.core.time.MCDuration;

import java.time.Duration;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class CoroutineLinkImpl<R> implements CoroutineLink<R> {
    @Override
    public CoroutineLink<Void> link(Runnable runnable) {
        return null;
    }

    @Override
    public <NR> CoroutineLink<NR> link(Supplier<? extends NR> supplier) {
        return null;
    }

    @Override
    public CoroutineLink<Void> link(Consumer<? super R> consumer) {
        return null;
    }

    @Override
    public <NR> CoroutineLink<NR> link(Function<? super R, ? extends NR> function) {
        return null;
    }

    @Override
    public CoroutineLink<R> link(UnaryOperator<R> operator) {
        return null;
    }

    @Override
    public <NR> CoroutineLink<NR> link(Coroutine<? super R, ? extends NR> subcoroutine) {
        return null;
    }

    @Override
    public CoroutineLink<R> delay(MCDuration mcDuration) {
        return null;
    }

    @Override
    public CoroutineLink<R> delay(Duration duration) {
        return null;
    }
}
