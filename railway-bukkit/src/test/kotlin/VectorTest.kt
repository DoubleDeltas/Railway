import math.*
import org.bukkit.util.Vector

fun main() {
    val v: Vector = Vector(1,2,3)
    val w: Vector = Vector(4,5,6)
    val u: Vector = Vector(7,8,9)

    val z1 = v + w + u
    println(z1)

    val z2 = evaluate {
        (v + w + u) cross w
    }
    println(z2)
}
