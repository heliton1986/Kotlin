package fundamentos.controle

fun main() {
    val nota = 2

    when(nota) {
        10, 9 -> println("Fantástico") // 10 ou 9, imprima
        8, 7 -> println("Parabéns") // 8 ou 7, imprima
        6, 5, 4 -> println("Tem como recuperar") // 6, 5 ou 4, imprima
        in 0..3 -> println("Te vejo no próximo semestre") // entre 0 e 3, imprima
        else -> println("Nota inválida") // senao imprima
    }
}