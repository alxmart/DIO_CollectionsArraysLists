fun main() {

    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("")

    println("Maior salario: ${salarios.maxOrNull()}")

    println("Menor salario: ${salarios.minOrNull()}")

    println("Médio salario: ${salarios.average()}")

    println("")

    val salariosMaiorQue2500 = salarios.filter {
        it > 2500.0
    }

    salariosMaiorQue2500.forEach { println(it)}

    println("")
    println(salarios.count{it in 2000.0 .. 5000.00})

    println("")
    println(salarios.find{it == 2250.00})

    println("")
    println(salarios.find{it == 8770.00})

    println("")
    println(salarios.any{it == 1000.00})













}