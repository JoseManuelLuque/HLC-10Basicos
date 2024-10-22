package Ejercicio7

import java.lang.Thread.sleep

/**
 * # Ejercicio 7: "Combate de dos personajes"
 * Crea un programa que simule el combate entre dos personajes. Cada
 * uno tiene una cantidad de vida y ataque. En cada ronda, el personaje A
 * ataca a B y viceversa, restando vida. El combate termina cuando uno de
 * los personajes tiene 0 o menos de vida.
 */

fun main() {
    val personaje = Personaje(150, 51)
    val enemigo = Personaje(100, 15)

    while (personaje.vida >= 0 && enemigo.vida >= 0) {
        println("TU TURNO:")
        enemigo.vida -= personaje.ataque
        println("El enemigo ha sufrido ${personaje.ataque} puntos de daño\nLe quedan ${enemigo.vida} puntos de salud\n")
        sleep(2000)

        if (enemigo.vida <= 0) {
            println("¡Has ganado!")
            break
        }

        println("TURNO ENEMIGO:")
        personaje.vida -= enemigo.ataque
        println("Te hizo ${enemigo.ataque} puntos de daño\nTe quedan ${personaje.vida} puntos de salud\n")
        sleep(2000)

        if (personaje.vida <= 0) {
            println("¡Has perdido!")
            break
        }
    }
}