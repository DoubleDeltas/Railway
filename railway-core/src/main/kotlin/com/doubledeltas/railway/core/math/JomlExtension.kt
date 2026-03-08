package com.doubledeltas.railway.core.math

import org.joml.*

// region [Destructuring]

operator fun Vector2dc.component1(): Double = x()
operator fun Vector2dc.component2(): Double = y()

operator fun Vector2d.component1(): Double = x()
operator fun Vector2d.component2(): Double = y()

operator fun Vector2fc.component1(): Float = x()
operator fun Vector2fc.component2(): Float = y()

operator fun Vector2f.component1(): Float = x()
operator fun Vector2f.component2(): Float = y()

operator fun Vector2ic.component1(): Int = x()
operator fun Vector2ic.component2(): Int = y()

operator fun Vector2i.component1(): Int = x()
operator fun Vector2i.component2(): Int = y()

operator fun Vector2Lc.component1(): Long = x()
operator fun Vector2Lc.component2(): Long = y()

operator fun Vector2L.component1(): Long = x()
operator fun Vector2L.component2(): Long = y()

operator fun Vector3dc.component1(): Double = x()
operator fun Vector3dc.component2(): Double = y()
operator fun Vector3dc.component3(): Double = z()

operator fun Vector3d.component1(): Double = x()
operator fun Vector3d.component2(): Double = y()
operator fun Vector3d.component3(): Double = z()

operator fun Vector3fc.component1(): Float = x()
operator fun Vector3fc.component2(): Float = y()
operator fun Vector3fc.component3(): Float = z()

operator fun Vector3f.component1(): Float = x()
operator fun Vector3f.component2(): Float = y()
operator fun Vector3f.component3(): Float = z()

operator fun Vector3ic.component1(): Int = x()
operator fun Vector3ic.component2(): Int = y()
operator fun Vector3ic.component3(): Int = z()

operator fun Vector3i.component1(): Int = x()
operator fun Vector3i.component2(): Int = y()
operator fun Vector3i.component3(): Int = z()

operator fun Vector3Lc.component1(): Long = x()
operator fun Vector3Lc.component2(): Long = y()
operator fun Vector3Lc.component3(): Long = z()

operator fun Vector3L.component1(): Long = x()
operator fun Vector3L.component2(): Long = y()
operator fun Vector3L.component3(): Long = z()

operator fun Vector4dc.component1(): Double = x()
operator fun Vector4dc.component2(): Double = y()
operator fun Vector4dc.component3(): Double = z()
operator fun Vector4dc.component4(): Double = w()

operator fun Vector4d.component1(): Double = x()
operator fun Vector4d.component2(): Double = y()
operator fun Vector4d.component3(): Double = z()
operator fun Vector4d.component4(): Double = w()

operator fun Vector4fc.component1(): Float = x()
operator fun Vector4fc.component2(): Float = y()
operator fun Vector4fc.component3(): Float = z()
operator fun Vector4fc.component4(): Float = w()

operator fun Vector4f.component1(): Float = x()
operator fun Vector4f.component2(): Float = y()
operator fun Vector4f.component3(): Float = z()
operator fun Vector4f.component4(): Float = w()

operator fun Vector4ic.component1(): Int = x()
operator fun Vector4ic.component2(): Int = y()
operator fun Vector4ic.component3(): Int = z()
operator fun Vector4ic.component4(): Int = w()

operator fun Vector4i.component1(): Int = x()
operator fun Vector4i.component2(): Int = y()
operator fun Vector4i.component3(): Int = z()
operator fun Vector4i.component4(): Int = w()

operator fun Vector4Lc.component1(): Long = x()
operator fun Vector4Lc.component2(): Long = y()
operator fun Vector4Lc.component3(): Long = z()
operator fun Vector4Lc.component4(): Long = w()

operator fun Vector4L.component1(): Long = x()
operator fun Vector4L.component2(): Long = y()
operator fun Vector4L.component3(): Long = z()
operator fun Vector4L.component4(): Long = w()

operator fun Quaterniondc.component1(): Double = x()
operator fun Quaterniondc.component2(): Double = y()
operator fun Quaterniondc.component3(): Double = z()
operator fun Quaterniondc.component4(): Double = w()

operator fun Quaterniond.component1(): Double = x()
operator fun Quaterniond.component2(): Double = y()
operator fun Quaterniond.component3(): Double = z()
operator fun Quaterniond.component4(): Double = w()

operator fun Quaternionfc.component1(): Float = x()
operator fun Quaternionfc.component2(): Float = y()
operator fun Quaternionfc.component3(): Float = z()
operator fun Quaternionfc.component4(): Float = w()

operator fun Quaternionf.component1(): Float = x()
operator fun Quaternionf.component2(): Float = y()
operator fun Quaternionf.component3(): Float = z()
operator fun Quaternionf.component4(): Float = w()

operator fun AxisAngle4d.component1(): Double = angle
operator fun AxisAngle4d.component2(): Vector3d = Vector3d(x, y, z)
operator fun AxisAngle4d.component3(): Double = x
operator fun AxisAngle4d.component4(): Double = y
operator fun AxisAngle4d.component5(): Double = z

operator fun AxisAngle4f.component1(): Float = angle
operator fun AxisAngle4f.component2(): Vector3f = Vector3f(x, y, z)
operator fun AxisAngle4f.component3(): Float = x
operator fun AxisAngle4f.component4(): Float = y
operator fun AxisAngle4f.component5(): Float = z

operator fun Matrix2fc.component1(): Float = m00()
operator fun Matrix2fc.component2(): Float = m01()
operator fun Matrix2fc.component3(): Float = m10()
operator fun Matrix2fc.component4(): Float = m11()

operator fun Matrix2f.component1(): Float = m00()
operator fun Matrix2f.component2(): Float = m01()
operator fun Matrix2f.component3(): Float = m10()
operator fun Matrix2f.component4(): Float = m11()

operator fun Matrix3dc.component1(): Double = m00()
operator fun Matrix3dc.component2(): Double = m01()
operator fun Matrix3dc.component3(): Double = m02()
operator fun Matrix3dc.component4(): Double = m10()
operator fun Matrix3dc.component5(): Double = m11()
operator fun Matrix3dc.component6(): Double = m12()
operator fun Matrix3dc.component7(): Double = m20()
operator fun Matrix3dc.component8(): Double = m21()
operator fun Matrix3dc.component9(): Double = m22()

operator fun Matrix3d.component1(): Double = m00()
operator fun Matrix3d.component2(): Double = m01()
operator fun Matrix3d.component3(): Double = m02()
operator fun Matrix3d.component4(): Double = m10()
operator fun Matrix3d.component5(): Double = m11()
operator fun Matrix3d.component6(): Double = m12()
operator fun Matrix3d.component7(): Double = m20()
operator fun Matrix3d.component8(): Double = m21()
operator fun Matrix3d.component9(): Double = m22()

operator fun Matrix3fc.component1(): Float = m00()
operator fun Matrix3fc.component2(): Float = m01()
operator fun Matrix3fc.component3(): Float = m02()
operator fun Matrix3fc.component4(): Float = m10()
operator fun Matrix3fc.component5(): Float = m11()
operator fun Matrix3fc.component6(): Float = m12()
operator fun Matrix3fc.component7(): Float = m20()
operator fun Matrix3fc.component8(): Float = m21()
operator fun Matrix3fc.component9(): Float = m22()

operator fun Matrix3f.component1(): Float = m00()
operator fun Matrix3f.component2(): Float = m01()
operator fun Matrix3f.component3(): Float = m02()
operator fun Matrix3f.component4(): Float = m10()
operator fun Matrix3f.component5(): Float = m11()
operator fun Matrix3f.component6(): Float = m12()
operator fun Matrix3f.component7(): Float = m20()
operator fun Matrix3f.component8(): Float = m21()
operator fun Matrix3f.component9(): Float = m22()

operator fun Matrix4dc.component1(): Double = m00()
operator fun Matrix4dc.component2(): Double = m01()
operator fun Matrix4dc.component3(): Double = m02()
operator fun Matrix4dc.component4(): Double = m03()
operator fun Matrix4dc.component5(): Double = m10()
operator fun Matrix4dc.component6(): Double = m11()
operator fun Matrix4dc.component7(): Double = m12()
operator fun Matrix4dc.component8(): Double = m13()
operator fun Matrix4dc.component9(): Double = m20()
operator fun Matrix4dc.component10(): Double = m21()
operator fun Matrix4dc.component11(): Double = m22()
operator fun Matrix4dc.component12(): Double = m23()
operator fun Matrix4dc.component13(): Double = m30()
operator fun Matrix4dc.component14(): Double = m31()
operator fun Matrix4dc.component15(): Double = m32()
operator fun Matrix4dc.component16(): Double = m33()

operator fun Matrix4d.component1(): Double = m00()
operator fun Matrix4d.component2(): Double = m01()
operator fun Matrix4d.component3(): Double = m02()
operator fun Matrix4d.component4(): Double = m03()
operator fun Matrix4d.component5(): Double = m10()
operator fun Matrix4d.component6(): Double = m11()
operator fun Matrix4d.component7(): Double = m12()
operator fun Matrix4d.component8(): Double = m13()
operator fun Matrix4d.component9(): Double = m20()
operator fun Matrix4d.component10(): Double = m21()
operator fun Matrix4d.component11(): Double = m22()
operator fun Matrix4d.component12(): Double = m23()
operator fun Matrix4d.component13(): Double = m30()
operator fun Matrix4d.component14(): Double = m31()
operator fun Matrix4d.component15(): Double = m32()
operator fun Matrix4d.component16(): Double = m33()

operator fun Matrix4fc.component1(): Float = m00()
operator fun Matrix4fc.component2(): Float = m01()
operator fun Matrix4fc.component3(): Float = m02()
operator fun Matrix4fc.component4(): Float = m03()
operator fun Matrix4fc.component5(): Float = m10()
operator fun Matrix4fc.component6(): Float = m11()
operator fun Matrix4fc.component7(): Float = m12()
operator fun Matrix4fc.component8(): Float = m13()
operator fun Matrix4fc.component9(): Float = m20()
operator fun Matrix4fc.component10(): Float = m21()
operator fun Matrix4fc.component11(): Float = m22()
operator fun Matrix4fc.component12(): Float = m23()
operator fun Matrix4fc.component13(): Float = m30()
operator fun Matrix4fc.component14(): Float = m31()
operator fun Matrix4fc.component15(): Float = m32()
operator fun Matrix4fc.component16(): Float = m33()

operator fun Matrix4f.component1(): Float = m00()
operator fun Matrix4f.component2(): Float = m01()
operator fun Matrix4f.component3(): Float = m02()
operator fun Matrix4f.component4(): Float = m03()
operator fun Matrix4f.component5(): Float = m10()
operator fun Matrix4f.component6(): Float = m11()
operator fun Matrix4f.component7(): Float = m12()
operator fun Matrix4f.component8(): Float = m13()
operator fun Matrix4f.component9(): Float = m20()
operator fun Matrix4f.component10(): Float = m21()
operator fun Matrix4f.component11(): Float = m22()
operator fun Matrix4f.component12(): Float = m23()
operator fun Matrix4f.component13(): Float = m30()
operator fun Matrix4f.component14(): Float = m31()
operator fun Matrix4f.component15(): Float = m32()
operator fun Matrix4f.component16(): Float = m33()

operator fun Matrix3x2dc.component1(): Double = m00()
operator fun Matrix3x2dc.component2(): Double = m01()
operator fun Matrix3x2dc.component3(): Double = m10()
operator fun Matrix3x2dc.component4(): Double = m11()
operator fun Matrix3x2dc.component5(): Double = m20()
operator fun Matrix3x2dc.component6(): Double = m21()

operator fun Matrix3x2d.component1(): Double = m00()
operator fun Matrix3x2d.component2(): Double = m01()
operator fun Matrix3x2d.component3(): Double = m10()
operator fun Matrix3x2d.component4(): Double = m11()
operator fun Matrix3x2d.component5(): Double = m20()
operator fun Matrix3x2d.component6(): Double = m21()

operator fun Matrix3x2fc.component1(): Float = m00()
operator fun Matrix3x2fc.component2(): Float = m01()
operator fun Matrix3x2fc.component3(): Float = m10()
operator fun Matrix3x2fc.component4(): Float = m11()
operator fun Matrix3x2fc.component5(): Float = m20()
operator fun Matrix3x2fc.component6(): Float = m21()

operator fun Matrix3x2f.component1(): Float = m00()
operator fun Matrix3x2f.component2(): Float = m01()
operator fun Matrix3x2f.component3(): Float = m10()
operator fun Matrix3x2f.component4(): Float = m11()
operator fun Matrix3x2f.component5(): Float = m20()
operator fun Matrix3x2f.component6(): Float = m21()

operator fun Matrix4x3dc.component1(): Double = m00()
operator fun Matrix4x3dc.component2(): Double = m01()
operator fun Matrix4x3dc.component3(): Double = m02()
operator fun Matrix4x3dc.component4(): Double = m10()
operator fun Matrix4x3dc.component5(): Double = m11()
operator fun Matrix4x3dc.component6(): Double = m12()
operator fun Matrix4x3dc.component7(): Double = m20()
operator fun Matrix4x3dc.component8(): Double = m21()
operator fun Matrix4x3dc.component9(): Double = m22()
operator fun Matrix4x3dc.component10(): Double = m30()
operator fun Matrix4x3dc.component11(): Double = m31()
operator fun Matrix4x3dc.component12(): Double = m32()

operator fun Matrix4x3d.component1(): Double = m00()
operator fun Matrix4x3d.component2(): Double = m01()
operator fun Matrix4x3d.component3(): Double = m02()
operator fun Matrix4x3d.component4(): Double = m10()
operator fun Matrix4x3d.component5(): Double = m11()
operator fun Matrix4x3d.component6(): Double = m12()
operator fun Matrix4x3d.component7(): Double = m20()
operator fun Matrix4x3d.component8(): Double = m21()
operator fun Matrix4x3d.component9(): Double = m22()
operator fun Matrix4x3d.component10(): Double = m30()
operator fun Matrix4x3d.component11(): Double = m31()
operator fun Matrix4x3d.component12(): Double = m32()

operator fun Matrix4x3f.component1(): Float = m00()
operator fun Matrix4x3f.component2(): Float = m01()
operator fun Matrix4x3f.component3(): Float = m02()
operator fun Matrix4x3f.component4(): Float = m10()
operator fun Matrix4x3f.component5(): Float = m11()
operator fun Matrix4x3f.component6(): Float = m12()
operator fun Matrix4x3f.component7(): Float = m20()
operator fun Matrix4x3f.component8(): Float = m21()
operator fun Matrix4x3f.component9(): Float = m22()
operator fun Matrix4x3f.component10(): Float = m30()
operator fun Matrix4x3f.component11(): Float = m31()
operator fun Matrix4x3f.component12(): Float = m32()

// endregion

// region [Constructor Alias]

fun vec(x: Double, y: Double) = Vector2d(x, y)
fun vec(x: Float, y: Float) = Vector2f(x, y)
fun vec(x: Int, y: Int) = Vector2i(x, y)
fun vec(x: Long, y: Long) = Vector2L(x, y)

fun vec(x: Double, y: Double, z: Double) = Vector3d(x, y, z)
fun vec(x: Float, y: Float, z: Float) = Vector3f(x, y, z)
fun vec(x: Int, y: Int, z: Int) = Vector3i(x, y, z)
fun vec(x: Long, y: Long, z: Long) = Vector3L(x.toInt(), y.toInt(), z.toInt())

fun vec(x: Double, y: Double, z: Double, w: Double) = Vector4d(x, y, z, w)
fun vec(x: Float, y: Float, z: Float, w: Float) = Vector4f(x, y, z, w)
fun vec(x: Int, y: Int, z: Int, w: Int) = Vector4i(x, y, z, w)
fun vec(x: Long, y: Long, z: Long, w: Long) = Vector4L(x, y, z, w)

fun mat(
    m00: Float, m01: Float,
    m10: Float, m11: Float
) = Matrix2f(m00, m01, m10, m11)

fun mat(
    m00: Double, m01: Double,
    m10: Double, m11: Double
) = Matrix2d(m00, m01, m10, m11)

fun mat(
    m00: Float, m01: Float, m02: Float,
    m10: Float, m11: Float, m12: Float,
    m20: Float, m21: Float, m22: Float
) = Matrix3f(m00, m01, m02, m10, m11, m12, m20, m21, m22)

fun mat(
    m00: Double, m01: Double, m02: Double,
    m10: Double, m11: Double, m12: Double,
    m20: Double, m21: Double, m22: Double
) = Matrix3d(m00, m01, m02, m10, m11, m12, m20, m21, m22)

fun mat(
    m00: Float, m01: Float, m02: Float, m03: Float,
    m10: Float, m11: Float, m12: Float, m13: Float,
    m20: Float, m21: Float, m22: Float, m23: Float,
    m30: Float, m31: Float, m32: Float, m33: Float
) = Matrix4f(m00, m01, m02, m03, m10, m11, m12, m13, m20, m21, m22, m23, m30, m31, m32, m33)

fun mat(
    m00: Double, m01: Double, m02: Double, m03: Double,
    m10: Double, m11: Double, m12: Double, m13: Double,
    m20: Double, m21: Double, m22: Double, m23: Double,
    m30: Double, m31: Double, m32: Double, m33: Double
) = Matrix4d(m00, m01, m02, m03, m10, m11, m12, m13, m20, m21, m22, m23, m30, m31, m32, m33)


fun mat(
    m00: Float, m01: Float,
    m10: Float, m11: Float,
    m20: Float, m21: Float
) = Matrix3x2f(m00, m01, m10, m11, m20, m21)

fun mat(
    m00: Double, m01: Double,
    m10: Double, m11: Double,
    m20: Double, m21: Double
) = Matrix3x2d(m00, m01, m10, m11, m20, m21)

fun mat(
    m00: Float, m01: Float, m02: Float,
    m10: Float, m11: Float, m12: Float,
    m20: Float, m21: Float, m22: Float,
    m30: Float, m31: Float, m32: Float
) = Matrix4x3f(m00, m01, m02, m10, m11, m12, m20, m21, m22, m30, m31, m32)

fun mat(
    m00: Double, m01: Double, m02: Double,
    m10: Double, m11: Double, m12: Double,
    m20: Double, m21: Double, m22: Double,
    m30: Double, m31: Double, m32: Double
) = Matrix4x3d(m00, m01, m02, m10, m11, m12, m20, m21, m22, m30, m31, m32)

fun quat(x: Float, y: Float, z: Float, w: Float) = Quaternionf(x, y, z, w)
fun quat(x: Double, y: Double, z: Double, w: Double) = Quaterniond(x, y, z, w)



// endregion
