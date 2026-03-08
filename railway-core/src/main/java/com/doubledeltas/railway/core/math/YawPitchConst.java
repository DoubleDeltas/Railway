package com.doubledeltas.railway.core.math;


/**
 * <p>Interface for immutable yaw-pitch pair in Minecraft.</p>
 *
 * All implementations should meet the <i>normality</i>:
 * <ul>
 *     <li>The return value of {@code getYaw()} is always in {@code (-180.0f, 180.0f]} range, in degrees.</li>
 *     <li>The return value of {@code getPitch()} is always in {@code [-90.0f, 90.0f]} range, in degrees.</li>
 * </ul>
 * @see YawPitchConst
 */
public interface YawPitchConst {
    YawPitchConst reflectToOrigin();

    YawPitchConst reflectToEquator();

    YawPitchConst reflectToPole();

    YawPitchConst getOriginReflection();

    YawPitchConst getEquatorReflection();

    YawPitchConst getPoleReflection();

    boolean equals(Object o);

    int hashCode();

    float getYaw();

    float getPitch();
}
