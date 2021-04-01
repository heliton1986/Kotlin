package c_orientacaoObjetos

import b_controleFluxoParadigmasProcedurais.testaCondicoes

fun main() {
    println("Bem vindo ao ByteBank")
    val contaAlex = ContaB() // criou uma variavel para indicar a classe Conta
    contaAlex.titular = "Alex" // chamando objeto titular através da variavel
    contaAlex.numero = 1000
    contaAlex.saldo = 200.0
    println("Titular = ${contaAlex.titular}") // imprimindo objeto através da variável
    println("Número da conta = ${contaAlex.numero}") // imprimindo objeto através da variável
    println("Saldo = ${contaAlex.saldo}\n") // imprimindo objeto através da variável

    val contaFran = ContaB()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0
    println("Titular = ${contaFran.titular}")
    println("Número da conta = ${contaFran.numero}")
    println("Saldo = ${contaFran.saldo}")
}

class ContaB() {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

    fun testaLacosB() {
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
