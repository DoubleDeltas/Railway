import com.doubledeltas.railway.core.math.ImmutableYawAndPitch


operator fun ImmutableYawAndPitch.component1() = this.yaw

operator fun ImmutableYawAndPitch.component2() = this.pitch