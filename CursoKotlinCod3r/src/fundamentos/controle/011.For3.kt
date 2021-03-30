package fundamentos.controle

fun main() {
    //Forma Ascendente com step
    println("Crescente")
    for(i in 0..100 step 5) {
        print("$i ")
    }

    println("\nDecrescente")
    // Decrescente com step
    for( i in 100 downTo 0 step 5) {
        print("$i ")
    }
}