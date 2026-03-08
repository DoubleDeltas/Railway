package com.doubledeltas.railway.bukkit.math

import com.doubledeltas.railway.core.math.*
import org.joml.Vector3d
import org.joml.Vector3dc

typealias BukkitVec = org.bukkit.util.Vector

fun evaluateVector(block: VectorEvaluation.() -> Vector3dc): BukkitVec {
    val (x, y, z) = VectorEvaluation().block()
    return BukkitVec(x, y, z)
}

@VectorEvaluation.Scope
class VectorEvaluation {
    @DslMarker
    annotation class Scope

    fun joml(bukkitVec: BukkitVec) = Vector3d(bukkitVec.x, bukkitVec.y, bukkitVec.z)

    operator fun BukkitVec.unaryMinus() = joml(this).negate()

    operator fun BukkitVec.plus(other: BukkitVec) = joml(this).add(other.x, other.y, other.z)

    operator fun BukkitVec.minus(other: BukkitVec) = joml(this).sub(other.x, other.y, other.z)

    operator fun BukkitVec.times(scalar: Int) = this * scalar.toDouble()

    operator fun BukkitVec.times(scalar: Float) = this * scalar.toDouble()

    operator fun BukkitVec.times(scalar: Double) = joml(this).mul(scalar)

    operator fun BukkitVec.times(other: BukkitVec) = joml(this).mul(other.x, other.y, other.z)

    operator fun BukkitVec.div(scalar: Int) = this / scalar.toDouble()

    operator fun BukkitVec.div(scalar: Float) = this / scalar.toDouble()

    operator fun BukkitVec.div(scalar: Double) = joml(this).div(scalar)

    operator fun BukkitVec.div(other: BukkitVec) = joml(this).div(other.x, other.y, other.z)

    operator fun Int.times(vector: BukkitVec) = joml(vector).mul(this.toDouble())

    operator fun Float.times(vector: BukkitVec) = joml(vector).mul(this.toDouble())

    operator fun Double.times(vector: BukkitVec) = joml(vector).mul(this.toDouble())

    infix fun BukkitVec.cross(other: BukkitVec) = joml(this).cross(other.x, other.y, other.z)
}