package Ejercicio6

/**
 * # Ejercicio 6: "Batalla de Daño Crítico"
 * Escribe una función que simule una batalla. El daño crítico se hace
 * cuando el ataque es mayor a 50. Si el ataque es mayor a 50, imprime
 * "¡Golpe crítico!" y devuelve el daño multiplicado por 2, de lo contrario
 * solo devuelve el daño normal.
 */

fun main() {
    val ataque = readln().toInt()

    if(ataque>50){
        println("$ataque Puntos de daño")
        critico(ataque)
    }else {
        println("$ataque Puntos de daño")
        ataque
    }
}

fun critico(ataque: Int): Int {
    return ataque * 2
}