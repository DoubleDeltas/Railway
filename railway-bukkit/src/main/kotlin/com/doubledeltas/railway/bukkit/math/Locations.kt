package com.doubledeltas.railway.bukkit.math

import com.doubledeltas.railway.core.math.Axis
import com.doubledeltas.railway.core.math.ImmutableYawAndPitch
import com.doubledeltas.railway.core.math.YawAndPitch
import org.bukkit.Location
import org.bukkit.util.Vector

operator fun Location.component1() = this.world

operator fun Location.component2() = VectorMath.mutableClone(this.toVector())

operator fun Location.component3() = YawAndPitch(this.yaw, this.pitch)

operator fun Location.get(axis: Axis) =
    when (axis) {
        Axis.X -> this.x
        Axis.Y -> this.y
        Axis.Z -> this.z
    }

operator fun Location.set(axis: Axis, value: Double) =
    when (axis) {
        Axis.X -> this.setX(value)
        Axis.Y -> this.setY(value)
        Axis.Z -> this.setZ(value)
    }

fun Location.getYawAndPitch() = YawAndPitch(this.yaw, this.pitch)

fun Location.setYawAndPitch(direction: ImmutableYawAndPitch): Location {
    this.yaw = direction.yaw
    this.pitch = direction.pitch
    return this
}

operator fun Location.plus(vec: Location) = this.clone().add(vec)

operator fun Location.plus(vec: Vector) = this.clone().add(vec)

operator fun Location.minus(vec: Location) = this.clone().subtract(vec)

operator fun Location.minus(vec: Vector) = this.clone().subtract(vec)

operator fun Location.times(scalar: Double) = this.clone().multiply(scalar)

