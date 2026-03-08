package com.doubledeltas.railway.bukkit.async;

import com.doubledeltas.railway.core.async.CoroutineBase;
import com.doubledeltas.railway.core.async.CoroutineChainer;
import com.doubledeltas.railway.core.async.CoroutineWalker;
import org.bukkit.scheduler.BukkitScheduler;

import java.util.function.Supplier;

public class BukkitCoroutineImpl<T, R>
        extends CoroutineBase<T, R>
        implements BukkitCoroutine<T, R>
{
    public BukkitCoroutineImpl(Supplier<? extends T> initSupplier, CoroutineChainer<? super T, ? extends R> chainer) {
        super();
    }



    @Override
    protected CoroutineWalker getWalker() {
        return null;
    }

    @Override
    public void run(BukkitScheduler scheduler) {
        // WIP
    }
}
