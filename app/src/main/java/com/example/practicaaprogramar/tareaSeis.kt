package com.example.practicaaprogramar

fun isMirrored(word: String){
    val mirroredWord = word.reversed()
    val word = word.dropLast(1)
    println("${word}" + "${mirroredWord}")
}

fun main(){
    isMirrored("android")
}