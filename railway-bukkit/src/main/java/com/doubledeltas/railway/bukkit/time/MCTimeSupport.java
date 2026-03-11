package com.doubledeltas.railway.bukkit.time;

import com.doubledeltas.railway.core.time.TickMapper;
import lombok.experimental.UtilityClass;
import org.bukkit.Bukkit;

import java.time.Duration;

/**
 * Utility class to support in Bukkit.
 */
@UtilityClass
public final class MCTimeSupport {
    public static final TickMapper tickMapper = new ReflectiveBukkitTickMapper(Bukkit.getServer());

    public long toTicks(Duration duration) {
        return tickMapper.toGameTime(duration).toTicks();
    }
}
