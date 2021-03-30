package fundamentos.controle

fun main() {
    val alunos = arrayListOf("André", "Carla", "Marcos")
    for ((indice, aluno) in alunos.withIndex()) { // withIndex, add indice
        println("${indice + 1} - $aluno")
    }
}