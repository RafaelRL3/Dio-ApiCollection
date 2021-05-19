package One.DigitalInnovation.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 3000.0
    salarios[1] = 5000.0
    salarios[2] = 600.0

    salarios.forEach {
        println(it)
    }

    println("-------------------")

    salarios.forEachIndexed{ index, salario->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it)}

    println("--------------------")
    val salarios2 = doubleArrayOf(300.0, 2000.0, 500.0)

    salarios2.sort()
    salarios2.forEach { println(it) }

}