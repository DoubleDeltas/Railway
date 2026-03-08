package com.doubledeltas.railway.core.time;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import org.intellij.lang.annotations.MagicConstant;
import org.jetbrains.annotations.NotNull;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.LongUnaryOperator;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode
public final class MCDuration implements Comparable<MCDuration>{
    private long ticks;

    private static class UnitDurationHolder {
        private static final Map<MCTimeUnit, MCDuration> UNIT_DURATIONS = new EnumMap<>(MCTimeUnit.class);

        static {
            for (MCTimeUnit unit : MCTimeUnit.values()) {
                UNIT_DURATIONS.put(unit, new MCDuration(unit.ticks));
            }
        }
    }

    // region FREQUENT OBJECTS
    public static final MCDuration TICK = UnitDurationHolder.UNIT_DURATIONS.get(MCTimeUnit.TICK);
    public static final MCDuration MC_HOUR = UnitDurationHolder.UNIT_DURATIONS.get(MCTimeUnit.MC_HOUR);
    public static final MCDuration MC_DAY = UnitDurationHolder.UNIT_DURATIONS.get(MCTimeUnit.MC_DAY);
    public static final MCDuration SECOND = UnitDurationHolder.UNIT_DURATIONS.get(MCTimeUnit.SECOND);
    public static final MCDuration MINUTE = UnitDurationHolder.UNIT_DURATIONS.get(MCTimeUnit.MINUTE);
    public static final MCDuration HOUR = UnitDurationHolder.UNIT_DURATIONS.get(MCTimeUnit.HOUR);
    public static final MCDuration DAY = UnitDurationHolder.UNIT_DURATIONS.get(MCTimeUnit.DAY);
    public static final MCDuration WEEK = UnitDurationHolder.UNIT_DURATIONS.get(MCTimeUnit.WEEK);
    public static final MCDuration MONTH = UnitDurationHolder.UNIT_DURATIONS.get(MCTimeUnit.MONTH);
    public static final MCDuration YEAR = UnitDurationHolder.UNIT_DURATIONS.get(MCTimeUnit.YEAR);
    public static final MCDuration FOREVER = UnitDurationHolder.UNIT_DURATIONS.get(MCTimeUnit.FOREVER);
    // endregion

    // region STATIC FACTORY METHODS
    public static MCDuration of(long ticks) {
        return new MCDuration(ticks);
    }

    public static MCDuration of(MCTimeUnit unit) {
        return UnitDurationHolder.UNIT_DURATIONS.get(unit);
    }

    public static MCDuration of(long amount, MCTimeUnit unit) {
        return new MCDuration(Math.multiplyExact(amount, unit.ticks));
    }

    public static MCDuration of(double amount, MCTimeUnit unit) {
        return new MCDuration((long) amount * unit.ticks);
    }
    // endregion

    // region Duration COMPATIBILITY

    /**
     * Convert {@link Duration} to {@code MCDuration}, based on classical 20 ticks/seconds consistency.
     */
    public static MCDuration from(Duration duration) {
        return of(duration.toMillis() / 50);
    }

    /**
     * Convert {@code MCDuration} to {@link Duration}, based on classical 20 ticks/seconds consistency.
     */
    public Duration toDuration() {
        return Duration.of(ticks * 50, ChronoUnit.MILLIS);
    }

    // endregion

    // region OPERATIONS

    public MCDuration plus(MCDuration other) {
        return new MCDuration(Math.addExact(ticks, other.ticks));
    }

    public MCDuration minus(MCDuration other) {
        return new MCDuration(Math.addExact(ticks, -other.ticks));
    }

    public MCDuration multiply(long m) {
        return new MCDuration(Math.multiplyExact(ticks, m));
    }

    public MCDuration multiply(double m) {
        return new MCDuration((long) m * ticks);
    }

    public MCDuration quotient(long d) {
        return new MCDuration(Math.floorDiv(ticks, d));
    }

    public MCDuration quotient(double d) {
        return new MCDuration(ticks / (long) d);
    }

    public MCDuration apply(LongUnaryOperator op) {
        return new MCDuration(op.applyAsLong(ticks));
    }

    public boolean isPositive() {
        return ticks > 0;
    }

    public boolean isNegative() {
        return ticks < 0;
    }

    public boolean isZero() {
        return ticks == 0;
    }

    @MagicConstant(intValues = {-1, 0, 1})
    public int signum() {
        return Long.signum(ticks);
    }

    // endregion

    @Override
    public int compareTo(@NotNull MCDuration o) {
        return Long.compare(ticks, o.ticks);
    }

    @Override
    public String toString() {
        return ticks + (Math.abs(ticks) == 1 ? " tick" : " ticks");
    }
}
