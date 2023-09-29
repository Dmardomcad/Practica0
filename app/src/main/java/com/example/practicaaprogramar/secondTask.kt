package com.example.practicaaprogramar

fun media(numbers: List<Int>){
    val mediaValue = numbers.average()
    println("the media from numbers $numbers is $mediaValue")
}

fun moda(numbers: List<Int>){
    val counting = mutableMapOf<Int, Int>()

    for(number in numbers) {
        if(counting.containsKey(number)){
            counting[number] = counting[number]!!+1
        } else {
            counting[number] = 1
        }
    }
    val mostCommon = counting.values.max()

    val mode = counting.filter { it.value == mostCommon }.keys.toList().first()
    println("La moda es $mode")
}

fun mediana(numbers: List<Int>){
    val numbersSorted = numbers.sorted()
    val listSize = numbersSorted.size
    if(listSize % 2 == 0){
        val firstHalf = numbersSorted[(listSize-1)/2]
        val secondHalf = numbersSorted[listSize/2]
        val medianaPar = (firstHalf + secondHalf) / 2

        println("The median is $medianaPar")
    }
    else {
        val medianaImpar = numbersSorted[listSize/2]
        println("The median is $medianaImpar")
    }

    //println(numbersSorted)

}



fun main(){
    media(listOf(5,5,5,5,10,4))
    mediana(listOf(2,3,3,5,7,10))
    mediana(listOf(7,6,5,3,2))
    mediana(listOf(2,3,3,4))
    moda(listOf(1,2,3,3,4))
}