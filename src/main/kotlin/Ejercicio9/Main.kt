package Ejercicio9

import Ejercicio9.Personaje
import java.lang.Thread.sleep

/**
 * # Ejercicio 9: "Sistema de Experiencia"
 * Escribe un programa que simule el sistema de experiencia de un
 * personaje. Cada vez que gane una batalla, aumenta su experiencia en
 * 50 puntos. Al llegar a 200 puntos o más, sube de nivel.
 */
fun main() {
    val personaje = Personaje(150, 51, 150)
    val enemigo = Personaje(100, 15, 0)

    while (personaje.vida >= 0 && enemigo.vida >= 0) {
        println("TU TURNO:")
        enemigo.vida -= personaje.ataque
        println("El enemigo ha sufrido ${personaje.ataque} puntos de daño\nLe quedan ${enemigo.vida} puntos de salud\n")
        sleep(2000)

        if (enemigo.vida <= 0) {
            println("¡Has ganado!")
            println("Has obtenido 50 puntos de experiencia.")
            personaje.exp += 50
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
    comprobarExp(personaje)
}

fun comprobarExp(personaje: Personaje) {
    if (personaje.exp > 200) {
        println("Has subido de nivel")
    }
}