package com.example.practicaaprogramar

fun rockPaperScissorsLizardSpock(play: List<String>){
    val results = mutableListOf<String>()

    for(game in play){
        val players = game.split(" vs ")
        if(players.size == 2){
            val playerOne = players[0]
            val playerTwo = players[1]

            val result = when {
                playerOne == "Rock" && playerTwo == "Scissors" -> "P1"
                playerOne == "Scissors" && playerTwo == "Paper" -> "P1"
                playerOne == "Paper" && playerTwo == "Rock" -> "P1"
                playerOne == "Paper" && playerTwo == "Spock" -> "P1"
                playerOne == "Lizard" && playerTwo == "Paper" -> "P1"
                playerOne == "Scissors" && playerTwo == "Lizard" -> "P1"
                playerOne == "Spock" && playerTwo == "Scissors" -> "P1"
                playerOne == "Rock" && playerTwo == "Lizard" -> "P1"
                playerOne == "Lizard" && playerTwo == "Spock" -> "P1"
                playerOne == "Spock" && playerTwo == "Rock" -> "P1"

                playerTwo == "Rock" && playerOne == "Scissors" -> "P2"
                playerTwo == "Scissors" && playerOne == "Paper" -> "P2"
                playerTwo == "Paper" && playerOne == "Rock" -> "P2"
                playerTwo == "Paper" && playerOne == "Spock" -> "P2"
                playerTwo == "Lizard" && playerOne == "Paper" -> "P2"
                playerTwo == "Scissors" && playerOne == "Lizard" -> "P2"
                playerTwo == "Spock" && playerOne == "Scissors" -> "P2"
                playerTwo == "Rock" && playerOne == "Lizard" -> "P2"
                playerTwo == "Lizard" && playerOne == "Spock" -> "P2"
                playerTwo == "Spock" && playerOne == "Rock" -> "P2"
                else -> "X"
            }

            results.add(result)
        }
    }
    println("$results")

}

fun main(){
    rockPaperScissorsLizardSpock(listOf("Rock vs Paper", "Paper vs Paper", "Spock vs Rock"))
}