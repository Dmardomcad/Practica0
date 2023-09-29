package com.example.practicaaprogramar

/*

Tarea 10 - Juego de mesa
Estamos construyendo un juego de mesa, y para el sistema de puntuación se nos ha ocurrido usar cartas de manera que sumando sus valores podamos llegar a cualquier puntuación.
Las cartas son caras así que NO queremos cartas REPETIDAS.
Dado un número P, tenemos que calcular el listado de cartas mínimo necesarias para poder representar todos los números desde 1 a P sin repetir
Ejemplo 1

    Entrada -> 1
    Salida -> Con la carta 1 ya representamos esa puntuación

Ejemplo 2

    Entrada -> 6
    Salida -> Nos hacen falta 3 cartas (1,2,3) para representar todos los números del 1 al 6

Ejemplo 3

    Entrada -> 7
    Salida -> 3 cartas. (1,2,4) Ejemplo 4
    Entrada 13 ->
    Salida -> 4 cartas (1,2,3,7)


 */

fun gameWithCards(number: Int){
    val cards = mutableListOf<Int>()
    var totalNumber = 0
    var actualNumber = 1

    while(totalNumber < number){
        if(totalNumber + actualNumber <= number){
            cards.add(actualNumber)
            totalNumber += actualNumber

        } else {
            println("numerooo $actualNumber")
            actualNumber++
            return
        }
        actualNumber++
    }
    println("You get ${cards.size} cards: $cards")
}

fun main(){
    gameWithCards(1)
    gameWithCards(6)
    gameWithCards(10)
    gameWithCards(13)
}