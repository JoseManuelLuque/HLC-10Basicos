package Ejercicio4

/**
 * # Ejercicio 4: "Monedas en un Tesoro"
 * Escribe un programa que simule recoger monedas. El programa debe
 * tener un bucle que repita 10 veces, sumando 5 monedas en cada
 * iteración, e imprimiendo el número de monedas en cada paso.
 */
fun main() {
    var monedas = 0

    for (i in 1..10) {
        monedas += 5
        println("TIenes $monedas monedas")
    }
}