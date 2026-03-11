package com.doubledeltas.railway.core.async

import com.doubledeltas.railway.core.time.MCDuration
import com.doubledeltas.railway.core.time.MCTimeUnit
import kotlin.coroutines.Continuation
import kotlin.time.Duration
import kotlin.time.toJavaDuration

interface Wait {
    suspend operator fun invoke(mcDuration: MCDuration, continuation: Continuation<Unit>)

    suspend operator fun invoke(ticks: Long, continuation: Continuation<Unit>) =
        invoke(MCDuration.of(ticks), continuation)

    suspend operator fun invoke(amount: Long, unit: MCTimeUnit, continuation: Continuation<Unit>) =
        invoke(MCDuration.of(amount, unit), continuation)

    suspend operator fun invoke(javaDuration: java.time.Duration, continuation: Continuation<Unit>)

    suspend operator fun invoke(kotlinDuration: Duration, continuation: Continuation<Unit>) =
        invoke(kotlinDuration.toJavaDuration(), continuation)
}