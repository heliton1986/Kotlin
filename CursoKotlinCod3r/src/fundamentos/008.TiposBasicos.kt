package fundamentos

fun main() {
    /*
    Tipos Numéricos Inteiros
    */

//    Byte = 8 bits
    val num1: Byte = 125
    println("O valor mínimo do Byte é ${Byte.MIN_VALUE}")
    println("O valor máximo do Byte é ${Byte.MAX_VALUE}")
    println("O tamanho do Byte em bits é ${Byte.SIZE_BITS}")
    println("O tamanho do Byte em Bytes é ${Byte.SIZE_BYTES}\n")

//    Short = 2 Bytes = 16 bits
    val num2: Short = 32767
    println("O valor mínimo do Short é ${Short.MIN_VALUE}")
    println("O valor máximo do Short é ${Short.MAX_VALUE}")
    println("O tamanho do Short em bits é ${Short.SIZE_BITS}")
    println("O tamanho do Short em Bytes é ${Short.SIZE_BYTES}\n")

//    Int = 2 Shorts = 4 Bytes = 32 bits
    val num3:Int = 2_147_483_647
    println("O valor mínimo do Int é ${Int.MIN_VALUE}")
    println("O valor máximo do Int é ${Int.MAX_VALUE}")
    println("O tamanho do Int em bits é ${Int.SIZE_BITS}")
    println("O tamanho do Int em Bytes é ${Int.SIZE_BYTES}\n")

//    Long = 2 Int = 8 Bytes = 64 bits
    val num4: Long = 9_223_372_036_854_775_807
    println("O valor mínimo do Long é ${Long.MIN_VALUE}")
    println("O valor máximo do Long é ${Long.MAX_VALUE}")
    println("O tamanho do Long em bits é ${Long.SIZE_BITS}")
    println("O tamanho do Long em Bytes é ${Long.SIZE_BYTES}\n")

    /*
    Tipos Numéricos Reais
    */

//    Float = Int = 4 Bytes
    val num5: Float = 3.14F
    println("O valor mínimo do Float é ${Float.MIN_VALUE}")
    println("O valor máximo do Float é ${Float.MAX_VALUE}")
    println("O tamanho do Float em bits é ${Float.SIZE_BITS}")
    println("O tamanho do Float em Bytes é ${Float.SIZE_BYTES}\n")

//    Double = 2 Float = Long = 8 Bytes
    val num6: Double = 3.14
    println("O valor mínimo do Double é ${Double.MIN_VALUE}")
    println("O valor máximo do Double é ${Double.MAX_VALUE}")
    println("O tamanho do Double em bits é ${Double.SIZE_BITS}")
    println("O tamanho do Double em Bytes é ${Double.SIZE_BYTES}\n")

    /*
    Tipo Caractere
    */

    val char: Char = '?' // Outros exemplos... '1', 'g', ' ', apenas um caracter

    /*
    Tipo Booleano
    */

    val boolean: Boolean = true // ou false
    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean)) // criando uma lista das variáveis

    println(2 is Int)
    println(250_542_465 is Int)
    println(250_542_4650.0F is Float)
    println(250_542_4650.1 is Double)
    println(10.dec())

}