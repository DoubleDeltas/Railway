package com.doubledeltas.railway.core.time;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * Legacy tick mapper, based on canonical 20 tick-per-second formula.
 */
public enum LegacyTickMapper implements TickMapper {
    INSTANCE;

    public static final long MILLIS_PER_TICK = 1_000 / 20;

    @Override
    public MCDuration toGameTime(Duration duration) {
        return MCDuration.of(duration.toMillis() / MILLIS_PER_TICK);
    }

    @Override
    public Duration toRealWorldTime(MCDuration mcDuration) {
        return Duration.of(mcDuration.toTicks() * MILLIS_PER_TICK , ChronoUnit.MILLIS);
    }
}
