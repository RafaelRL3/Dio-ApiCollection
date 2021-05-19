package One.DigitalInnovation.collections

fun main() {
    val values = intArrayOf(2, 3, 4, 5, 6, 1, 10, 11)
    values.forEach {
        println(it)
    }
    println("-------------------------")
    values.sort()
    values.forEach {
        println(it)
    }

}