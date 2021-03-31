package b_controleFluxoParadigmasProcedurais

fun main() {
    println("Bem vindo ao ByteBank")

    // Usando for para
    for (i in 1..5) {

        val titular: String = "Heliton $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("Titular = $titular")
        println("Número da conta = $numeroConta")
        println("Saldo = $saldo")
        println()

    }

    testaCondicoes(0.0)
}


fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println("Conta é positiva")
    } else if (saldo == 0.0) {
        println("Conta é neutra")
    } else {
        println("Conta é negativa")
    }

    // OU

    when {
        saldo > 0.0 -> {
            println("Conta é positiva")
        }
        saldo == 0.0 -> {
            println("Conta é neutra")
        }
        else -> {
            println("Conta é negativa")
        }
    }

    // OU

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}
