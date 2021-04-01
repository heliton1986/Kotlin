package c_orientacaoObjetos

import b_controleFluxoParadigmasProcedurais.testaCondicoes

fun main() {
    println("Bem vindo ao ByteBank")
    testaLacos()
}

    fun testaLacos() {
        var i = 0
        while (i < 5) {
            val titular: String = "Heliton $i"
            val numeroConta: Int = 1000 + i
            var saldo: Double = i + 10.0

            println("Titular = $titular")
            println("Número da conta = $numeroConta")
            println("Saldo = $saldo")
            println()
            i++
        }

        // Usando for para
        for (i in 5 downTo 1 step 1) {
            if (i == 4) {
                continue
            }
        }
    }

//fun testaCondicoes(saldo: Double) {
//
//    if (saldo > 0.0) {
//        println("Conta é positiva")
//    } else if (saldo == 0.0) {
//        println("Conta é neutra")
//    } else {
//        println("Conta é negativa")
//    }
//
//    // OU
//
//    when {
//        saldo > 0.0 -> {
//            println("Conta é positiva")
//        }
//        saldo == 0.0 -> {
//            println("Conta é neutra")
//        }
//        else -> {
//            println("Conta é negativa")
//        }
//    }
//
//    // OU
//
//    when {
//        saldo > 0.0 -> println("Conta é positiva")
//        saldo == 0.0 -> println("Conta é neutra")
//        else -> println("Conta é negativa")
//    }
//}
