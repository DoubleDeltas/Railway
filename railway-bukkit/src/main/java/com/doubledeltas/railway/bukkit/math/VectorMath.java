package com.doubledeltas.railway.bukkit.math;

import lombok.experimental.UtilityClass;
import org.bukkit.util.Vector;

import java.util.Objects;

@UtilityClass
public final class VectorMath {
    public static final ZeroVector ZERO = new ZeroVector();

    private static final double EPSILON = Vector.getEpsilon();

    public static boolean eq(Vector v1, Vector v2) {
        if (Objects.equals(v1, v2))
            return true;
        return Math.abs(v1.getX() - v2.getX()) < EPSILON &&
                Math.abs(v1.getY() - v2.getY()) < EPSILON &&
                Math.abs(v1.getZ() - v2.getZ()) < EPSILON;
    }

    public static boolean neq(Vector v1, Vector v2) {
        if (Objects.equals(v1, v2))
            return false;
        return Math.abs(v1.getX() - v2.getX()) >= EPSILON ||
                Math.abs(v1.getY() - v2.getY()) >= EPSILON ||
                Math.abs(v1.getZ() - v2.getZ()) >= EPSILON;
    }

    public static Vector mutableClone(Vector vector) {
        return new Vector().copy(vector);
    }

    public static ImmutableVector immutableClone(Vector vector) {
        return new ImmutableVector(vector.getX(), vector.getY(), vector.getZ());
    }

    public static Vector normalized(Vector vector) {
        return mutableClone(vector).normalize();
    }
}
