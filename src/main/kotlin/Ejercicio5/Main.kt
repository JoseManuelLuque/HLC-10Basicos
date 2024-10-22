package Ejercicio5

/**
 * # Ejercicio 5: "Determinando el Nivel del Ejercicio7.Personaje"
 * Crea un programa que pida el nivel de un personaje. Si el nivel es menor
 * a 10, debe imprimir "Ejercicio7.Personaje principiante". Si es entre 10 y 20,
 * "Ejercicio7.Personaje intermedio". Si es mayor a 20, "Ejercicio7.Personaje avanzado".
 */

fun main() {
    var nivel:Int = readln().toInt()
    if (nivel < 10) {
        println("Ejercicio7.Personaje principiante")
    }else if (nivel <= 20) {
        println("Ejercicio7.Personaje intermedio")
    }else if (nivel > 20) {
        println("Ejercicio7.Personaje avanzado")
    }
}