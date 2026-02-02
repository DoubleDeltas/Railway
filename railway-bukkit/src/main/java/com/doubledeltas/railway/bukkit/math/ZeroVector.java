package com.doubledeltas.railway.bukkit.math;

import org.bukkit.util.NumberConversions;
import org.bukkit.util.Vector;

/**
 * <p>Immutable Zero Vector.</p>
 * <p>This provides also trivial, constant return values by its properties.</p>
 */
public class ZeroVector extends ImmutableVector {
    ZeroVector() {
        super(0.0, 0.0, 0.0);
    }

    @Override
    public double length() {
        return 0.0;
    }

    @Override
    public double lengthSquared() {
        return 0.0;
    }

    @Override
    public double distance(Vector o) {
        return o.length();
    }

    @Override
    public double distanceSquared(Vector o) {
        return o.lengthSquared();
    }

    @Override
    public float angle(Vector other) {
        throw new ArithmeticException("angle with zero-vector is not defined");
    }

    @Override
    public Vector getMidpoint(Vector other) {
        double x = other.getX() / 2.0;
        double y = other.getY() / 2.0;
        double z = other.getZ() / 2.0;
        return new Vector(x, y, z);
    }

    @Override
    public double dot(Vector other) {
        return 0.0;
    }

    @Override
    public Vector getCrossProduct(Vector o) {
        return this;
    }

    @Override
    public boolean isInSphere(Vector origin, double radius) {
        return NumberConversions.square(origin.getX()) +
                NumberConversions.square(origin.getY()) +
                NumberConversions.square(origin.getZ()) <= NumberConversions.square(radius);
    }

    @Override
    public double getX() {
        return 0.0;
    }

    @Override
    public int getBlockX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0.0;
    }

    @Override
    public int getBlockY() {
        return 0;
    }

    @Override
    public double getZ() {
        return 0.0;
    }

    @Override
    public int getBlockZ() {
        return 0;
    }

    @Override
    public void checkFinite() throws IllegalArgumentException {
        // always finite, do nothing
    }
}
