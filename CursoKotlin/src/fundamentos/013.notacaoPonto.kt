package fundamentos

fun main() {
    val a: Int = 33.dec() //dec é decrementar 1
    var b: String = a.toString() //converter o valor de "a" para String

    println("Int: $a")
    println("Primeiro char da string b é ${b[0]} ")
//    OU
    println("Primeiro char da string b é ${b.first()} ")
    println("Último char da string b é ${b.last()} ")
}