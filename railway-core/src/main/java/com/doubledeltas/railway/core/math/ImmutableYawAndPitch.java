package com.doubledeltas.railway.core.math;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * <p>Immutable data class to represent yaw and pitch in Minecraft.</p>
 *
 * <ul>
 *     <li><code>yaw</code> is in <code>(-180.0f, 180.0f]</code> range, in degrees.</li>
 *     <li><code>pitch</code> is in <code>[-90.0f, 90.0f]</code> range, in degrees.</li>
 * </ul>
 * @see YawAndPitch
 */
@Getter @NoArgsConstructor
public class ImmutableYawAndPitch {
    protected float yaw;
    protected float pitch;

    public ImmutableYawAndPitch(int yaw, int pitch) {
        this.yaw = yaw;
        this.pitch = pitch;
    }

    public ImmutableYawAndPitch(float yaw, float pitch) {
        this.yaw = yaw;
        this.pitch = pitch;
    }

    public ImmutableYawAndPitch(double yaw, double pitch) {
        this.yaw = (float) yaw;
        this.pitch = (float) pitch;
    }
}
