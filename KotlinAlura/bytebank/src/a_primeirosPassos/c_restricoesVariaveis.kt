fun main() {
    println("Bem vindo ao ByteBank")


    var titular: String = "Alex"
    //val titular: String = "Alex"
    // val é imutável, nao pode ser reatribuido
    titular = "Heliton"
    val numeroConta: Int = 1000
    var saldo: Double = 0.0
    saldo = 100 + 2.0
    saldo += 200

    println("Titular = $titular")
    println("Número da conta = $numeroConta")
    println("Número da conta = $saldo")
}