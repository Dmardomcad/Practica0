package com.example.practicaaprogramar

fun leetify(wordToLeet: String) {
    val abecedary= mapOf(
        'a' to "4",
        'b' to "I3",
        'c' to "[",
        'd' to ")",
        'e' to "3",
        'f' to "|=",
        'g' to "&",
        'h' to "#",
        'i' to "1",
        'j' to ",_|",
        'k' to ">|",
        'l' to "1",
        'm' to "/\\/\\",
        'n' to "^/",
        'o' to "0",
        'p' to "|*",
        'q' to "(_,)",
        'r' to "I2",
        's' to "5",
        't' to "7",
        'u' to "(_)",
        'v' to "\\/",
        'w' to "\\/\\/",
        'x' to "><",
        'y' to "j",
        'z' to "2",
    )

    var translatedWord = ""

    for(letter in wordToLeet) {
        val replaceLetter = abecedary[letter]
        if (replaceLetter != null){
            translatedWord += replaceLetter
        } else {
            translatedWord += letter
        }

    }
    println(translatedWord)
}
fun main(){
    leetify("android")
}