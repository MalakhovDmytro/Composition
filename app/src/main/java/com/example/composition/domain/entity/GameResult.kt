package com.example.composition.domain.entity

import java.io.Serializable

data class GameResult (
    val winner: Boolean,
    val countOfRightAnswers: Int,
    val CountOfQuestions: Int,
    val GameSettings: GameSettings
        ): Serializable {
}