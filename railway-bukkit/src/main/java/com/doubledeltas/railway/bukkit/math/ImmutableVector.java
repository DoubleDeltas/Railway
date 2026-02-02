package com.doubledeltas.railway.bukkit.math;

import org.bukkit.util.Vector;

public class ImmutableVector extends Vector {
    public ImmutableVector() {
        super();
    }

    public ImmutableVector(int x, int y, int z) {
        super(x, y, z);
    }

    public ImmutableVector(float x, float y, float z) {
        super(x, y, z);
    }

    public ImmutableVector(double x, double y, double z) {
        super(x, y, z);
    }

    @Override
    @Deprecated
    public final Vector add(Vector vec) {
        throw new UnsupportedOperationException("updating immutable vector is not allowed");
    }

    @Override
    @Deprecated
    public final Vector subtract(Vector vec) {
        throw new UnsupportedOperationException("updating immutable vector is not allowed");
    }

    @Override
    @Deprecated
    public final Vector multiply(Vector vec) {
        throw new UnsupportedOperationException("updating immutable vector is not allowed");
    }

    @Override
    @Deprecated
    public final Vector divide(Vector vec) {
        throw new UnsupportedOperationException("updating immutable vector is not allowed");
    }

    @Override
    @Deprecated
    public final Vector copy(Vector vec) {
        throw new UnsupportedOperationException("updating immutable vector is not allowed");
    }

    @Override
    @Deprecated
    public final Vector midpoint(Vector other) {
        throw new UnsupportedOperationException("updating immutable vector is not allowed");
    }

    @Override
    @Deprecated
    public final Vector multiply(int m) {
        throw new UnsupportedOperationException("updating immutable vector is not allowed");
    }

    @Override
    @Deprecated
    public final Vector multiply(double m) {
        throw new UnsupportedOperationException("updating immutable vector is not allowed");
    }

    @Override
    @Deprecated
    public final Vector multiply(float m) {
        throw new UnsupportedOperationException("updating immutable vector is not allowed");
    }

    @Override
    @Deprecated
    public final Vector crossProduct(Vector o) {
        throw new UnsupportedOperationException("updating immutable vector is not allowed");
    }

    @Override
    @Deprecated
    public final Vector normalize() {
        throw new UnsupportedOperationException("updating immutable vector is not allowed");
    }

    @Override
    @Deprecated
    public final Vector zero() {
        throw new UnsupportedOperationException("updating immutable vector is not allowed");
    }

    @Override
    @Deprecated
    public final Vector setX(int x) {
        throw new UnsupportedOperationException("updating immutable vector is not allowed");
    }

    @Override
    @Deprecated
    public final Vector setX(double x) {
        throw new UnsupportedOperationException("updating immutable vector is not allowed");
    }

    @Override
    @Deprecated
    public final Vector setX(float x) {
        throw new UnsupportedOperationException("updating immutable vector is not allowed");
    }

    @Override
    @Deprecated
    public final Vector setY(int y) {
        throw new UnsupportedOperationException("updating immutable vector is not allowed");
    }

    @Override
    @Deprecated
    public final Vector setY(double y) {
        throw new UnsupportedOperationException("updating immutable vector is not allowed");
    }

    @Override
    @Deprecated
    public final Vector setY(float y) {
        throw new UnsupportedOperationException("updating immutable vector is not allowed");
    }

    @Override
    @Deprecated
    public final Vector setZ(int z) {
        throw new UnsupportedOperationException("updating immutable vector is not allowed");
    }

    @Override
    @Deprecated
    public final Vector setZ(double z) {
        throw new UnsupportedOperationException("updating immutable vector is not allowed");
    }

    @Override
    @Deprecated
    public final Vector setZ(float z) {
        throw new UnsupportedOperationException("updating immutable vector is not allowed");
    }
}
