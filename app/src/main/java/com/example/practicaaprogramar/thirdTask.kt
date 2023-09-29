package com.example.practicaaprogramar

fun findLongest(words: List<String>){
    var longestString = words[0]
    for(word in words){
        if(word.length > longestString.length) {
            longestString = word
        }
    }
    println("The longest string is $longestString")
}

fun main(){
    findLongest(listOf("Robot","Xenomorph","Dog","Zombie"))
}