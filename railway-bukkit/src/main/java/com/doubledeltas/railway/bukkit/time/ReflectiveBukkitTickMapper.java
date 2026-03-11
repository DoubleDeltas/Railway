package com.doubledeltas.railway.bukkit.time;

import com.doubledeltas.railway.core.time.MCDuration;
import com.doubledeltas.railway.core.time.TickMapper;
import org.bukkit.Server;

import java.lang.reflect.Method;
import java.time.Duration;

/**
 * TickMapper for Bukkit based on Reflection.
 */
public class ReflectiveBukkitTickMapper implements TickMapper {
    private final Server server;

    private static final long NANOS_PER_SECOND = 1_000_000_000;

    public ReflectiveBukkitTickMapper(Server server) {
        this.server = server;
    }

    @Override
    public MCDuration toGameTime(Duration duration) {
        return MCDuration.of((long) (duration.getSeconds() * getTickRate()));
    }

    @Override
    public Duration toRealWorldTime(MCDuration mcDuration) {
        double d = mcDuration.toTicks() / (double) getTickRate();
        return Duration.ofSeconds((long) d, (long) (d * NANOS_PER_SECOND % NANOS_PER_SECOND));
    }

    private float getTickRate() {
        try {
            Method rGetServerTickManager = server.getClass().getDeclaredMethod("getServerTickManager");
            Object serverTickManager = rGetServerTickManager.invoke(server);
            Method rGetTickRate = serverTickManager.getClass().getDeclaredMethod("getTickRate");

            return (float) rGetTickRate.invoke(serverTickManager);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }
}
