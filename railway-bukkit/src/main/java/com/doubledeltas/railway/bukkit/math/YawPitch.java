package com.doubledeltas.railway.bukkit.math;

import com.doubledeltas.railway.core.math.BaseYawPitch;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.configuration.serialization.SerializableAs;
import org.bukkit.util.Vector;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/**
 * Data class for representing Yaw-Pitch pair, specialized for Bukkit.
 * @see com.doubledeltas.railway.core.math.YawPitch
 */
@SerializableAs("YawPitch")
public final class YawPitch
        extends BaseYawPitch
        implements com.doubledeltas.railway.core.math.YawPitch, Cloneable, ConfigurationSerializable
{
    private static final Random random = new Random();

    public YawPitch(int yaw, int pitch) {
        super(yaw, pitch);
    }

    public YawPitch(float yaw, float pitch) {
        super(yaw, pitch);
    }

    public YawPitch(double yaw, double pitch) {
        super(yaw, pitch);
    }

    /**
     * <p>Gets an random {@code YawPitch}, uniformly distributed to the sphere.</p>
     * @return A random {@code YawPitch}
     */
    public static YawPitch getRandom() {
        float yaw = (random.nextFloat() * 360.0f) - 180.0f;

        double z = random.nextDouble() * 2.0 - 1.0; // uniform in [-1, 1)
        float pitch = (float) Math.toDegrees(Math.asin(z));

        return new YawPitch(yaw, pitch);
    }

    public static YawPitch fromVector(Vector vector) {
        return VectorMath.getYawPitch(vector);
    }

    @Override
    protected YawPitch clone() {
        try {
            return (YawPitch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new Error(e);
        }
    }

    @Override
    public BaseYawPitch getOriginReflection() {
        return this.clone().reflectToOrigin();
    }

    @Override
    public BaseYawPitch getEquatorReflection() {
        return this.clone().reflectToEquator();
    }

    @Override
    public BaseYawPitch getPoleReflection() {
        return this.clone().reflectToPole();
    }

    @Override
    public Map<String, Object> serialize() {
        Map<String, Object> result = new LinkedHashMap<>();

        result.put("yaw", getYaw());
        result.put("pitch", getPitch());

        return result;
    }

    public static YawPitch deserialize(Map<String, Object> map) {
        float yaw = 0;
        float pitch = 0;

        if (map.containsKey("yaw"))
            yaw = (Float) map.get("yaw");
        if (map.containsKey("pitch"))
            pitch = (Float) map.get("pitch");

        return new YawPitch(yaw, pitch);
    }
}
