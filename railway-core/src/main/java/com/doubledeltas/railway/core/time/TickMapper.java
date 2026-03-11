package com.doubledeltas.railway.core.time;

import java.time.Duration;

/**
 * Bidirectional mapper between real time({@link Duration}) and game time({@link MCDuration})
 */
public interface TickMapper {
    MCDuration toGameTime(Duration duration);
    Duration toRealWorldTime(MCDuration mcDuration);
}
