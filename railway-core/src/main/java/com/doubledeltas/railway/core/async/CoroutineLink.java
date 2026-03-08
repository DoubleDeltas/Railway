package com.doubledeltas.railway.core.async;

import com.doubledeltas.railway.core.time.MCDuration;
import com.doubledeltas.railway.core.time.MCTimeUnit;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public interface CoroutineLink<R> {
    CoroutineLink<Void> link(Runnable runnable);

    <NR> CoroutineLink<NR> link(Supplier<? extends NR> supplier);

    CoroutineLink<Void> link(Consumer<? super R> consumer);

    <NR> CoroutineLink<NR> link(Function<? super R, ? extends NR> function);

    CoroutineLink<R> link(UnaryOperator<R> operator);

    <NR> CoroutineLink<NR> link(Coroutine<? super R, ? extends NR> subcoroutine);

    CoroutineLink<R> delay(MCDuration mcDuration);

    default CoroutineLink<R> delay(long ticks) {
        return delay(MCDuration.of(ticks));
    }

    default CoroutineLink<R> delay(long amount, MCTimeUnit mcTimeUnit) {
        return delay(MCDuration.of(amount, mcTimeUnit));
    }

    default CoroutineLink<R> delay(double amount, MCTimeUnit mcTimeUnit) {
        return delay(MCDuration.of(amount, mcTimeUnit));
    }

    CoroutineLink<R> delay(Duration duration);

    default CoroutineLink<R> delay(long amount, TemporalUnit temporalUnit) {
        return delay(Duration.of(amount, temporalUnit));
    }

}
