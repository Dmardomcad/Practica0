package com.example.practicaaprogramar

fun tennisGame(roundWinners: List<String>) {
    var playerOneScore = 0
    var playerTwoScore = 0

    for (winner in roundWinners) {
        when {
            winner == "P1" -> playerOneScore++
            winner == "P2" -> playerTwoScore++
            else -> {
                println("ERROR INPUT IS NOT VALID: $winner")
                return
            }
        }

        if(playerOneScore >= 4 && playerOneScore - playerTwoScore >= 2){
            println("P1 is the winner")
            return
        }
        if(playerTwoScore >= 4 && playerTwoScore - playerOneScore >= 2){
            println("P2 is the winner")
            return
        }

        val playerOnePoints = when(playerOneScore){
            0 -> "Love"
            1 -> "15"
            2 -> "30"
            3 -> "40"
            else -> "Deuce"
        }
        val playerTwoPoints = when(playerTwoScore){
            0 -> "Love"
            1 -> "15"
            2 -> "30"
            3 -> "40"
            else -> "Deuce"
        }
        if(playerOneScore >= 3 && playerTwoScore >= 3 && playerOneScore == playerTwoScore){
            println("Deuce")
        } else if (playerOneScore >=3 && playerTwoScore >= 3 && playerOneScore - playerTwoScore == 1){
            println("Ventaja P1")
        } else if (playerOneScore >= 3 && playerTwoScore >= 3 && playerTwoScore - playerOneScore == 1){
            println("Ventaja P2")
        } else {
            println("$playerOnePoints - $playerTwoPoints")
        }

    }
}
fun main(){
    tennisGame(listOf("P1", "P1", "P2", "P2", "P1", "P2", "P1", "P1"))
}