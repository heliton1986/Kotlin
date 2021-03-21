package fundamentos

fun main() {
//    variável que pode ter o valor nulo
    val a: Int? = null // safe call operator
    print(a?.dec())
}