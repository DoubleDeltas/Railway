package com.doubledeltas.railway.bukkit.math

import com.doubledeltas.railway.core.math.Axis
import org.bukkit.util.Vector
import kotlin.experimental.ExperimentalTypeInference

@OptIn(ExperimentalTypeInference::class)
@OverloadResolutionByLambdaReturnType
fun evaluate(block: VectorEvaluation.() -> Double): Double = VectorEvaluation().block()

@OptIn(ExperimentalTypeInference::class)
@OverloadResolutionByLambdaReturnType
fun evaluate(block: VectorEvaluation.() -> VectorExpression): Vector = VectorEvaluation().block().finish()

class VectorExpression internal constructor(vector: Vector) {
    private var vector: Vector = VectorMath.mutableClone(vector)

    operator fun get(axis: Axis) =
        when (axis) {
            Axis.X -> vector.x
            Axis.Y -> vector.y
            Axis.Z -> vector.z
        }

    operator fun component1() = vector.x

    operator fun component2() = vector.y

    operator fun component3() = vector.z

    operator fun unaryPlus() = this

    operator fun unaryMinus(): VectorExpression {
        vector.multiply(-1)
        return this
    }

    operator fun not() = !vector

    operator fun plus(other: Vector): VectorExpression {
        vector.add(other)
        return this
    }

    operator fun minus(other: Vector): VectorExpression {
        vector.subtract(other)
        return this
    }

    operator fun times(scalar: Int): VectorExpression {
        vector.multiply(scalar)
        return this
    }

    operator fun times(scalar: Float): VectorExpression {
        vector.multiply(scalar)
        return this
    }

    operator fun times(scalar: Double): VectorExpression {
        vector.multiply(scalar)
        return this
    }

    operator fun times(other: Vector): VectorExpression {
        vector.multiply(other)
        return this
    }

    operator fun div(scalar: Int): VectorExpression {
        vector.multiply(1.0 / scalar)
        return this
    }

    operator fun div(scalar: Float): VectorExpression {
        vector.multiply(1.0 / scalar)
        return this
    }

    operator fun div(scalar: Double): VectorExpression {
        vector.multiply(1.0 / scalar)
        return this
    }

    operator fun div(other: Vector): VectorExpression {
        vector.divide(other)
        return this
    }

    operator fun Int.times(vector: Vector) = this@VectorExpression * this@times

    operator fun Float.times(vector: Vector) = this@VectorExpression * this@times

    operator fun Double.times(vector: Vector) = this@VectorExpression * this@times

    infix fun dot(other: Vector) = vector dot other

    infix fun cross(other: Vector): VectorExpression {
        vector.crossProduct(other)
        return this
    }

    infix fun Vector.eq(other: Vector) = VectorMath.eq(vector, other)

    infix fun Vector.neq(other: Vector) = !(this eq other)

    @OptIn(ExperimentalTypeInference::class)
    @OverloadResolutionByLambdaReturnType
    fun transform(f: (Vector) -> Double): Double = f(vector)

    @OptIn(ExperimentalTypeInference::class)
    @OverloadResolutionByLambdaReturnType
    fun transform(proc: (Vector) -> Unit): VectorExpression {
        proc(vector)
        return this
    }

    @OptIn(ExperimentalTypeInference::class)
    @OverloadResolutionByLambdaReturnType
    fun transform(f: (Vector) -> Vector): VectorExpression {
        vector = f(vector)
        return this
    }

    fun finish(): Vector = vector
}

@VectorEvaluation.Scope
class VectorEvaluation {
    @DslMarker
    annotation class Scope

    operator fun Vector.unaryPlus() = VectorExpression(this)

    operator fun Vector.unaryMinus() = VectorExpression(Vector(-this.x, -this.y, -this.z))

    operator fun Vector.plus(other: Vector) = VectorExpression(this) + other

    operator fun Vector.minus(other: Vector) = VectorExpression(this) - other

    operator fun Vector.times(scalar: Int) = VectorExpression(this) * scalar

    operator fun Vector.times(scalar: Float) = VectorExpression(this) * scalar

    operator fun Vector.times(scalar: Double) = VectorExpression(this) * scalar

    operator fun Vector.times(other: Vector) = VectorExpression(this) * other

    operator fun Vector.div(scalar: Int) = VectorExpression(this) / scalar

    operator fun Vector.div(scalar: Float) = VectorExpression(this) / scalar

    operator fun Vector.div(scalar: Double) = VectorExpression(this) / scalar

    operator fun Vector.div(other: Vector) = VectorExpression(this) / other

    operator fun Int.times(vector: Vector) = VectorExpression(vector) * this

    operator fun Float.times(vector: Vector) = VectorExpression(vector) * this

    operator fun Double.times(vector: Vector) = VectorExpression(vector) * this

    infix fun Vector.cross(other: Vector) = VectorExpression(this) cross other
}