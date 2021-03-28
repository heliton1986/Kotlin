package fundamentos

fun main() {
    val bomHumor = true
//    val bomHumor = false

//    Imprimindo uma condição dentro do print
    print("Hoje estou ${if (bomHumor) "feliz" else "chateado"}.")

    if (bomHumor) {
        print("Hoje estou feliz")
    } else {
        print("Hoje estou chateado")
    }

}