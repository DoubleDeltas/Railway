package com.doubledeltas.railway.bukkit.math

import com.doubledeltas.railway.core.math.*
import org.bukkit.util.Vector
import org.joml.Vector3d
import org.joml.Vector3dc

typealias BukkitVec = Vector

fun evaluateVector(block: VectorEvaluation.() -> Vector3dc): BukkitVec {
    val (x, y, z) = VectorEvaluation().block()
    return BukkitVec(x, y, z)
}

@VectorEvaluation.Scope
class VectorEvaluation {
    @DslMarker
    annotation class Scope

    private fun joml(bukkitVec: BukkitVec) = Vector3d(bukkitVec.x, bukkitVec.y, bukkitVec.z)

    operator fun BukkitVec.unaryMinus(): Vector3d =
        joml(this).negate()

    operator fun BukkitVec.plus(other: BukkitVec): Vector3d =
        joml(this).add(other.x, other.y, other.z)

    operator fun BukkitVec.minus(other: BukkitVec): Vector3d =
        joml(this).sub(other.x, other.y, other.z)

    operator fun BukkitVec.times(scalar: Int): Vector3d =
        this * scalar.toDouble()

    operator fun BukkitVec.times(scalar: Float): Vector3d =
        this * scalar.toDouble()

    operator fun BukkitVec.times(scalar: Double): Vector3d =
        joml(this).mul(scalar)

    operator fun BukkitVec.times(other: BukkitVec): Vector3d =
        joml(this).mul(other.x, other.y, other.z)

    operator fun BukkitVec.div(scalar: Int): Vector3d =
        this / scalar.toDouble()

    operator fun BukkitVec.div(scalar: Float): Vector3d =
        this / scalar.toDouble()

    operator fun BukkitVec.div(scalar: Double): Vector3d =
        joml(this).div(scalar)

    operator fun BukkitVec.div(other: BukkitVec): Vector3d =
        joml(this).div(other.x, other.y, other.z)

    operator fun Int.times(vector: BukkitVec): Vector3d =
        joml(vector).mul(this.toDouble())

    operator fun Float.times(vector: BukkitVec): Vector3d =
        joml(vector).mul(this.toDouble())

    operator fun Double.times(vector: BukkitVec): Vector3d =
        joml(vector).mul(this)

    infix fun BukkitVec.cross(other: BukkitVec): Vector3d =
        joml(this).cross(other.x, other.y, other.z)
}