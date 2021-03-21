package fundamentos

fun main() {
    val  a: Int? = null
    println(a?.inc()) // variavel modo segura ? com incremento inc()

    println("Momento do erro...")
    println(a!!.inc()) // !! significa forçar que chame a variável mesmo sabendo que ela está null
}