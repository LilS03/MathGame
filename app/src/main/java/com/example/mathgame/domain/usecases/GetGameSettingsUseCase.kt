package com.example.mathgame.domain.usecases

import com.example.mathgame.domain.entity.GameSettings
import com.example.mathgame.domain.entity.Level
import com.example.mathgame.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}