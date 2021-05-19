package One.DigitalInnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 3000.0, 4000.0)
    for(it in salarios){
        println(it)
    }
    println("--------------------")
    println("Maior salario eh: ${salarios.maxOrNull()}" )
    println("Menor salario eh: ${salarios.minOrNull()}" )
    println("Media salarial: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter {  it > 2500}
    println("--------------------")
    salariosMaiorQue2500.forEach(){
        println(it)
    }
    println("--------------------")
    println( salarios.count{it in 2500.0 .. 5000.0 })
    if (!salarios.any{it == 900.0 }){
        println("Isn't there")
    }else{
        println(salarios.find { it == 3000.0})
    }
    println(salarios.any{it == 900.0})
    println(salarios.any{it == 3000.0})
}