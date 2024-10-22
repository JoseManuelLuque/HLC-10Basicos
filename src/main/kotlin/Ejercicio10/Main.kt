package Ejercicio10

import java.lang.Thread.sleep
import kotlin.random.Random

/**
 * # Ejercicio 10: "Simulación de ataque en equipo"
 * Crea un programa que simule un ataque en equipo. Cada miembro del
 * equipo tiene un daño diferente y todos atacan a un enemigo con vida
 * inicial de 500. El programa debe restar la suma de los ataques de todos
 * los miembros al enemigo hasta que su vida sea 0 o menor.
 */
fun main() {
    val equipo = mutableListOf<Personaje>()

    val personaje = Personaje(200, 50, 0)
    val Paco = Personaje(200, 20, 0)
    val Antonio = Personaje(200, 35, 0)

    equipo.add(personaje)
    equipo.add(Paco)
    equipo.add(Antonio)

    val enemigo = Personaje(500, 20, 0)

    while (personaje.vida >= 0 && enemigo.vida >= 0) {
        for (personaje in equipo) {
            println("TU TURNO:")
            enemigo.vida -= personaje.ataque
            println("El enemigo ha sufrido ${personaje.ataque} puntos de daño\nLe quedan ${enemigo.vida} puntos de salud\n")
            sleep(2000)

            if (enemigo.vida <= 0) {
                println("¡Has ganado!")
                println("Has obtenido 50 puntos de experiencia.")
                personaje.exp += 50
                Paco.exp += 50
                Antonio.exp += 50
                break
            }
        }

        println("TURNO ENEMIGO:")

        equipo[0].vida -= enemigo.ataque
        println("Te hizo ${enemigo.ataque} puntos de daño\nTe quedan ${personaje.vida} puntos de salud\n")
        sleep(2000)

        if (personaje.vida <= 0) {
            println("¡Has perdido!")
            break
        }
    }
}