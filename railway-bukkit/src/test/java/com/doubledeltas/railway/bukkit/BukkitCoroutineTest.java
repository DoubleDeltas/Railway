package com.doubledeltas.railway.bukkit;

import com.doubledeltas.railway.bukkit.async.BukkitCoroutine;

public class BukkitCoroutineTest {
    public void test() {
        BukkitCoroutine.create(chain -> chain
                .link(() -> {

                })
                .delay(20)
                .link(() -> {
                    return 10;
                })
        ).run();
    }
}
