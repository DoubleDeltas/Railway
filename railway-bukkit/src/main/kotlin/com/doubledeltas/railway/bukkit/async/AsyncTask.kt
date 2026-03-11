package com.doubledeltas.railway.bukkit.async

import com.doubledeltas.railway.bukkit.time.MCTimeSupport
import com.doubledeltas.railway.core.async.Wait
import com.doubledeltas.railway.core.time.MCDuration
import org.bukkit.plugin.Plugin
import org.bukkit.scheduler.BukkitScheduler
import kotlin.coroutines.Continuation
import kotlin.coroutines.resume

/**
 * Waiting on Bukkit plugin async-task.
 * Create single, static BukkitHalt object on the plugin to use,
 * and invoke it in `suspend` function like:
 * ```kt
 * import static com.example.somePlugin.SomePlugin.waitFor
 *
 * suspend fun countDown(player: Player) {
 *  player.sendMessage("Sheesh...");
 *  waitFor(2, Duration.SECOND)
 *  player.sendMessage("Boom!");
 * }
 * ```
 */
class BukkitWait(
    private val plugin: Plugin
) : Wait {
    private val scheduler: BukkitScheduler = plugin.server.scheduler

    override suspend operator fun invoke(
        mcDuration: MCDuration,
        continuation: Continuation<Unit>
    ) {
        scheduler.runTaskLater(
            plugin,
            { continuation.resume(Unit) } as Runnable,
            mcDuration.toTicks()
        )
    }

    override suspend fun invoke(
        javaDuration: java.time.Duration,
        continuation: Continuation<Unit>
    ) = invoke(MCTimeSupport.toGameTime(javaDuration) as MCDuration, continuation)
}