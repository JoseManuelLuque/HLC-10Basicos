package Ejercicio8

data class Personaje(
    var vida: Int,
    var ataque: Int,
    var inventario: MutableList<Objeto>
)