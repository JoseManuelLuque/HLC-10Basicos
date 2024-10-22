package Ejercicio3

/**
 * # Ejercicio 3: "Multiplicando Ataques"
 * Escribe una función llamada multiplicarAtaques que tome un número
 * entero como argumento y lo multiplique por 5. Usa esa función para
 * calcular y mostrar el daño total de 3 ataques.
 */
fun main() {
    var ataque = 5
    for (i in 1..3) {
        ataque = multiplicarAtaque(ataque)
        println("El atauqe hace $ataque puntos de daño")
    }
}

fun multiplicarAtaque(ataque: Int): Int {
    return ataque * 5
}