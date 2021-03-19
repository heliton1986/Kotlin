package fundamentos

fun main() {
//    variável que pode ter o valor nulo
    var a: Int? = null // safe call operator
    print(a?.dec())
}