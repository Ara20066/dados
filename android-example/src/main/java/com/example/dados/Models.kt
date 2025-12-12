package com.example.dados

data class ScoringRule(
    val combination: String,
    val points: String
)

data class GameRecord(
    val game: String,
    val score: String
)

data class Dados(
    val title: String,
    val description: String,
    val scoringTitle: String,
    val scoringRules: List<ScoringRule>,
    val historyTitle: String,
    val gameHistory: List<GameRecord>
)
