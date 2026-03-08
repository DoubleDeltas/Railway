package com.doubledeltas.railway.bukkit.async;

import com.doubledeltas.railway.core.async.Coroutine;
import com.doubledeltas.railway.core.async.CoroutineChainer;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.scheduler.BukkitScheduler;

import java.util.function.Supplier;

public interface BukkitCoroutine<T, R> extends Coroutine<T, R> {
    void run(BukkitScheduler scheduler);

    default void run(Server server) {
        run(server.getScheduler());
    }

    default void run() {
        run(Bukkit.getScheduler());
    }

    static <CR> BukkitCoroutine<Void, CR> create(
            CoroutineChainer<Void, ? extends CR> chainer
    ) {
        return new BukkitCoroutineImpl<>(() -> null, chainer);
    }

    static <CT, CR> BukkitCoroutine<CT, CR> create(
            CT initialValue,
            CoroutineChainer<? super CT, ? extends CR> chainer
    ) {
        return new BukkitCoroutineImpl<>(() -> initialValue, chainer);
    }

    static <CT, CR> BukkitCoroutine<CT, CR> create(
            Supplier<? extends CT> initialSupplier,
            CoroutineChainer<? super CT, ? extends CR> chainer
    ) {
        return new BukkitCoroutineImpl<>(initialSupplier, chainer);
    }
}
