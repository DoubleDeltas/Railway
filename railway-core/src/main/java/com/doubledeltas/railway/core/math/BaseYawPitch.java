package com.doubledeltas.railway.core.math;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * Common skeletal implementation for {@link YawPitch}.
 * It must be extended and specialized by server APIs.
 */
@Getter @Setter
public abstract class BaseYawPitch implements YawPitch {
    private static final float EPSILON = 1e-4f;

    protected float yaw;
    protected float pitch;

    public BaseYawPitch(int yaw, int pitch) {
        this.yaw = yaw;
        this.pitch = pitch;
    }

    public BaseYawPitch(float yaw, float pitch) {
        this.yaw = yaw;
        this.pitch = pitch;
    }

    public BaseYawPitch(double yaw, double pitch) {
        this.yaw = (float) yaw;
        this.pitch = (float) pitch;
    }

    protected void normalize() {
        yaw = (yaw + 180.0f) % 360.0f - 180.0f;
        pitch = Math.max(-180.0f, Math.min(180.0f, pitch));
    }

    @Override
    public BaseYawPitch reflectToOrigin() {
        yaw = this.yaw + 180.0f;
        pitch = -this.pitch;
        normalize();
        return this;
    }

    @Override
    public BaseYawPitch reflectToEquator() {
        pitch = -this.pitch;
        normalize();
        return this;
    }

    @Override
    public BaseYawPitch reflectToPole() {
        yaw = this.yaw + 180.0f;
        normalize();
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof BaseYawPitch)) return false;
        BaseYawPitch yawPitch = (BaseYawPitch) object;
        return Math.abs(yaw - yawPitch.yaw) < EPSILON && Math.abs(pitch - yawPitch.pitch) < EPSILON;
    }

    @Override
    public int hashCode() {
        return Objects.hash(yaw, pitch);
    }

    @Override
    public String toString() {
        return yaw + "," + pitch;
    }
}
