package One.DigitalInnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    values.forEach{
        println(it)
    }

    println("--------------------")

    for(valor in values){ //como iterar no kotlin
        println(valor)
    }
}