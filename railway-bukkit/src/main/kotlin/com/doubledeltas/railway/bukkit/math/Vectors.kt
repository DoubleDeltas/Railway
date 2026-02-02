package com.doubledeltas.railway.bukkit.math

import com.doubledeltas.railway.core.math.Axis
import org.bukkit.util.Vector

operator fun Vector.get(axis: Axis) =
    when (axis) {
        Axis.X -> this.x
        Axis.Y -> this.y
        Axis.Z -> this.z
    }

operator fun Vector.set(axis: Axis, value: Int) =
    when (axis) {
        Axis.X -> this.setX(value)
        Axis.Y -> this.setY(value)
        Axis.Z -> this.setZ(value)
    }

operator fun Vector.set(axis: Axis, value: Float) =
    when (axis) {
        Axis.X -> this.setX(value)
        Axis.Y -> this.setY(value)
        Axis.Z -> this.setZ(value)
    }

operator fun Vector.set(axis: Axis, value: Double) =
    when (axis) {
        Axis.X -> this.setX(value)
        Axis.Y -> this.setY(value)
        Axis.Z -> this.setZ(value)
    }

operator fun Vector.component1() = this.x

operator fun Vector.component2() = this.y

operator fun Vector.component3() = this.z

operator fun Vector.unaryPlus() = this

operator fun Vector.unaryMinus() = Vector(-this.x, -this.y, -this.z)

operator fun Vector.not() = this.lengthSquared() == 0.0

operator fun Vector.plus(other: Vector) = this.clone().add(other)

operator fun Vector.minus(other: Vector) = this.clone().subtract(other)

operator fun Vector.times(scalar: Int) = this.clone().multiply(scalar)

operator fun Vector.times(scalar: Float) = this.clone().multiply(scalar)

operator fun Vector.times(scalar: Double) = this.clone().multiply(scalar)

operator fun Vector.times(other: Vector) = this.clone().multiply(other)

operator fun Vector.div(scalar: Int) = this.clone().multiply(1.0 / scalar)

operator fun Vector.div(scalar: Float) = this.clone().multiply(1.0 / scalar)

operator fun Vector.div(scalar: Double) = this.clone().multiply(1.0 / scalar)

operator fun Vector.div(other: Vector) = this.clone().divide(other)

operator fun Int.times(vector: Vector) = vector.clone().multiply(this)

operator fun Float.times(vector: Vector) = vector.clone().multiply(this)

operator fun Double.times(vector: Vector) = vector.clone().multiply(this)

infix fun Vector.dot(other: Vector) = this.dot(other)

infix fun Vector.cross(other: Vector) = this.getCrossProduct(other)

infix fun Vector.eq(other: Vector) = VectorMath.eq(this, other)

infix fun Vector.neq(other: Vector) = !(this eq other)

