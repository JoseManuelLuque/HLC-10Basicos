package Ejercicio8

/**
 * # Ejercicio 8: "Inventario de Objetos"
 * Crea un programa que simule un inventario de un personaje usando una
 * lista. El personaje puede añadir un objeto al inventario, eliminarlo o
 * mostrar los objetos actuales.
 */

fun main() {
    val espada: Objeto = Objeto("Espada", "Arma")

    var inventario = mutableListOf<Objeto>()

    var personaje: Personaje = Personaje(100, 15, inventario)
    println("Inventario del personaje: ${personaje.inventario}")
    inventario.add(espada)
    println("Inventario del personaje: ${personaje.inventario}")

}