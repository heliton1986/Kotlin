package fundamentos.controle

fun main() {
    // Break rotulado (É ERRADO)
    loopExterno@for (i in 1..15) { //loop@ é um rótulo
        for (j in 1..15) {
            if (i == 2 && j == 9) break@loopExterno
            println("i = $i e j = $j")
        }
    }
    println("Fim")
}