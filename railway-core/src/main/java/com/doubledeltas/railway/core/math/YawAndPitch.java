package com.doubledeltas.railway.core.math;

import lombok.Setter;

/**
 * <p>Mutable data class to represent yaw and pitch in Minecraft.</p>
 *
 * <ul>
 *     <li><code>yaw</code> is in <code>(-180.0f, 180.0f]</code> range, in degrees.</li>
 *     <li><code>pitch</code> is in <code>[-90.0f, 90.0f]</code> range, in degrees.</li>
 * </ul>
 * @see ImmutableYawAndPitch
 */
@Setter
public class YawAndPitch extends ImmutableYawAndPitch {
    public YawAndPitch(int yaw, int pitch) {
        super(yaw, pitch);
    }

    public YawAndPitch(float yaw, float pitch) {
        super(yaw, pitch);
    }

    public YawAndPitch(double yaw, double pitch) {
        super(yaw, pitch);
    }
}
