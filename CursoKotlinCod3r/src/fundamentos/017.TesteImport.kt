package fundamentos

import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.FaceMoeda.COROA
import fundamentos.pacoteB.subtracao
import fundamentos.pacoteA.simplesFuncao as funcaoSimples

fun main() {
    kotlin.io.println(funcaoSimples("Testando a função simples"))

    val coisa = Coisa("Metal")
    println(coisa.nome)

    println(COROA)

    println("A soma é ${soma(2, 3)} e a subtração é ${subtracao(2, 2)}")

}








