package com.example.practicaaprogramar

fun fibonacci(fibonacciNum: Int){
    var fibonacciNumStart = 0
    var fibonacciSum = 1

    while(fibonacciNumStart <= fibonacciNum){
        println(fibonacciNumStart)
        val fibonacciTotal = fibonacciNumStart + fibonacciSum
        fibonacciNumStart = fibonacciSum
        fibonacciSum = fibonacciTotal
    }
}

fun main(){
    fibonacci(100)
}