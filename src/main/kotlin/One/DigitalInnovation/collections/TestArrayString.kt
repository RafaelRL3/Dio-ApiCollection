package One.DigitalInnovation.collections

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Jose"
    nomes[1] = "Lucas"
    nomes[2] = "Plot"

    nomes.forEach {
        println(it)
    }

    println("____________________")
    nomes.sort()
    nomes.forEach {
        println(it)
    }
    println("____________________")

    val nomes2 = arrayOf("Lucas", "Zaza", "Jose")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }

}