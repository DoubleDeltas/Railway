package math

import org.bukkit.util.Vector
import kotlin.experimental.ExperimentalTypeInference

@OptIn(ExperimentalTypeInference::class)
@OverloadResolutionByLambdaReturnType
fun evaluate(block: VectorEvaluation.() -> Double): Double =
    VectorEvaluation().run(block)

@OptIn(ExperimentalTypeInference::class)
@OverloadResolutionByLambdaReturnType
fun evaluate(block: VectorEvaluation.() -> VectorExpression): Vector =
    VectorMath.mutableClone(VectorEvaluation().run(block))

class VectorExpression internal constructor(vector: Vector) : Vector(vector.x, vector.y, vector.z)

@VectorEvaluation.Scope
class VectorEvaluation {
    @DslMarker
    annotation class Scope

    operator fun Vector.plus(other: Vector) =
        VectorExpression(this) + other

    operator fun Vector.minus(other: Vector) =
        VectorExpression(this) - other

    operator fun Vector.times(other: Vector) =
        VectorExpression(this) * other

    operator fun Vector.div(scalar: Int) =
        VectorExpression(this) * scalar

    operator fun Vector.div(scalar: Float) =
        VectorExpression(this) * scalar

    operator fun Vector.div(scalar: Double) =
        VectorExpression(this) * scalar

    operator fun Vector.div(other: Vector) =
        VectorExpression(this) / other

    operator fun Int.times(vector: Vector) =
        VectorExpression(vector) * this

    operator fun Float.times(vector: Vector) =
        VectorExpression(vector) * this

    operator fun Double.times(vector: Vector) =
        VectorExpression(vector) * this

    infix fun Vector.cross(other: Vector) =
        VectorExpression(this) cross other

    operator fun VectorExpression.unaryMinus(): VectorExpression {
        this.multiply(-1)
        return this
    }

    operator fun VectorExpression.plus(other: Vector): VectorExpression {
        this.add(other)
        return this
    }

    operator fun VectorExpression.minus(other: Vector): VectorExpression {
        this.subtract(other)
        return this
    }

    operator fun VectorExpression.times(scalar: Int): VectorExpression {
        this.multiply(scalar)
        return this
    }

    operator fun VectorExpression.times(scalar: Float): VectorExpression {
        this.multiply(scalar)
        return this
    }

    operator fun VectorExpression.times(scalar: Double): VectorExpression {
        this.multiply(scalar)
        return this
    }

    operator fun VectorExpression.times(other: Vector): VectorExpression {
        this.multiply(other)
        return this
    }

    operator fun VectorExpression.div(scalar: Int): VectorExpression {
        this.multiply(1.0 / scalar)
        return this
    }

    operator fun VectorExpression.div(scalar: Float): VectorExpression {
        this.multiply(1.0 / scalar)
        return this
    }

    operator fun VectorExpression.div(scalar: Double): VectorExpression {
        this.multiply(1.0 / scalar)
        return this
    }

    operator fun VectorExpression.div(other: Vector): VectorExpression {
        this.divide(other)
        return this
    }

    infix fun VectorExpression.cross(other: Vector): VectorExpression {
        this.crossProduct(other)
        return this
    }
}