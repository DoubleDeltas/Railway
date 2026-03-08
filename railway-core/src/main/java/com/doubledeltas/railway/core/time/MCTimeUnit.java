package com.doubledeltas.railway.core.time;

import lombok.AllArgsConstructor;

import java.time.Duration;

@AllArgsConstructor
public enum MCTimeUnit {
    TICK(1),

    MC_HOUR(1_000),
    MC_DAY(24_000),

    SECOND(20),
    MINUTE(SECOND.ticks * 60),
    HOUR(MINUTE.ticks * 60),
    DAY(HOUR.ticks * 24),
    WEEK(DAY.ticks * 7),
    MONTH(DAY.ticks * 30),
    YEAR(DAY.ticks * 365),

    FOREVER(Long.MAX_VALUE)
    ;

    final long ticks;
}
