package d_implementandoComportamentos

import b_controleFluxoParadigmasProcedurais.testaCondicoes

fun main() {
    println("Bem vindo ao ByteBank")
    val contaAlex = ContaE() // criou uma variavel para indicar a classe Conta
    contaAlex.titular = "Alex" // chamando objeto titular através da variavel
    contaAlex.numero = 1000
    contaAlex.saldo = 200.0

    val contaFran = ContaE()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0

    // imprimindo objeto através da variável
    println("Titular = ${contaAlex.titular}")
    println("Número da conta = ${contaAlex.numero}")
    println("Saldo = ${contaAlex.saldo}\n")

    println("Titular = ${contaFran.titular}")
    println("Número da conta = ${contaFran.numero}")
    println("Saldo = ${contaFran.saldo}\n")

    // Depósito
    println("Depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("Depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("Sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("Sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("Saquem em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("Saquem em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

}

class ContaE() {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
        }
    }

}

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++ // só irá atribuir +1 a numeroY, pois atribuição é uma cópia

    println("numerox = $numeroX") // = 10
    println("numeroY = $numeroY") // = 11

    val contaJoao = ContaE()
    contaJoao.titular = "João"
//    var contaMaria = contaJoao
    var contaMaria = ContaE()
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    // Ambos são referenciados pelo objeto/classe ContaE()
    println("Titular conta joao: ${contaJoao.titular}")
    println("Titular conta maria: ${contaMaria.titular}")

// Mostra a mesma referencia, mostrando que está pegando do mesmo objeto Conta()
    println(contaJoao) // c_orientacaoObjetos.ContaE@52cc8049
    println(contaMaria) // c_orientacaoObjetos.ContaE@52cc8049
}

    fun testaLacosD() {
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
