package com.doubledeltas.railway.bukkit.math;

import lombok.NonNull;
import lombok.experimental.UtilityClass;
import org.bukkit.util.Vector;

import java.util.Objects;

@UtilityClass
public final class VectorMath {
    private static final double EPSILON = Vector.getEpsilon();

    public static boolean isZero(@NonNull Vector v) {
        return Math.abs(v.getX()) < EPSILON &&
                Math.abs(v.getY()) < EPSILON &&
                Math.abs(v.getZ()) < EPSILON;
    }

    public static boolean eq(@NonNull Vector v1, @NonNull Vector v2) {
        if (Objects.equals(v1, v2))
            return true;
        return Math.abs(v1.getX() - v2.getX()) < EPSILON &&
                Math.abs(v1.getY() - v2.getY()) < EPSILON &&
                Math.abs(v1.getZ() - v2.getZ()) < EPSILON;
    }

    public static boolean neq(@NonNull Vector v1, @NonNull Vector v2) {
        if (Objects.equals(v1, v2))
            return false;
        return Math.abs(v1.getX() - v2.getX()) >= EPSILON ||
                Math.abs(v1.getY() - v2.getY()) >= EPSILON ||
                Math.abs(v1.getZ() - v2.getZ()) >= EPSILON;
    }

    public static Vector cloneOf(@NonNull Vector vector) {
        return new Vector().copy(vector);
    }

    public static Vector normalized(@NonNull Vector vector) {
        return cloneOf(vector).normalize();
    }

    public static float getYaw(@NonNull Vector vector) {
        if (isZero(vector))
            return 0.0f;    // axis

        return (float) Math.toDegrees(Math.atan2(-vector.getX(), vector.getZ()));
    }

    public static float getPitch(@NonNull Vector vector) {
        double xy = Math.sqrt(vector.getX() * vector.getX() + vector.getZ() * vector.getZ());

        return (float) -Math.toDegrees(Math.atan(vector.getY() / xy));
    }

    public static YawPitch getYawPitch(@NonNull Vector vector) {
        return new YawPitch(getYaw(vector), getPitch(vector));
    }
}
