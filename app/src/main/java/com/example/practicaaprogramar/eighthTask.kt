package com.example.practicaaprogramar

fun triplePremio(){
    for(number in 1..100){
        println(
            when {
                number % 15 == 0 -> "triplepremio"
                number % 5 == 0 -> "premio"
                number % 3 == 0 -> "triple"

                else -> number
            }
        )
    }
}

fun main() {
    triplePremio()
}