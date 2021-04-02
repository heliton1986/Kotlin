package fundamentos.controle

fun main() {
    var opcao: Int = 0;

    // Usado quando nao tem quantidade determinada de repetições
    while (opcao != -1) {
        val line = readLine() ?: "" // readLine() le uma entrada no console
        opcao = line.toIntOrNull() ?: 0

        println("Você escolheu a opção $opcao")
    }

    println("Até a próxima")
}