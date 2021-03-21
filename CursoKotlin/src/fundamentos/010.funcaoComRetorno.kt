package fundamentos

// função com retorno, precisa de um retorno no caso que seja Int
fun soma(a: Int, b: Int = 1): Int {
    return a + b
}

// imprimindo função com retorno, use print(função())
fun main() {

    println(soma(2 , 3))
    println(soma(10))
}