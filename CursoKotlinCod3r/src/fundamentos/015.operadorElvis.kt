package fundamentos

fun main() {
    val opcional: String? = null
//    val opcional: String? = "2" // se tiver um valor que nao seja null, irá imprimir apenas esse valor
    val obrigatorio: String = opcional ?: "Valor Padrão" // usa operador Elvis ?: quando tem uma variavel null safety e pretende atribuir a ela outra variável que nao seja null safety

    println(obrigatorio)
}