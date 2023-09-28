package com.example.practicaaprogramar

fun isCapicua(checkCapicua: Int){
    if(checkCapicua.toString() == checkCapicua.toString().reversed()){
        println("the number $checkCapicua is capicua")
    }
    else {
        println("the number $checkCapicua is not capicua")
    }
}

fun main(){
    isCapicua(212)
    isCapicua(314)
}