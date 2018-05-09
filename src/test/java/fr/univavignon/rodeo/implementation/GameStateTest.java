package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateTest;
import fr.univavignon.rodeo.api.SpecieLevel;

public class GameStateTest extends IGameStateTest {
    @Override
    protected IGameState getInstance() {
        return new GameState(SpecieLevel.NOVICE, 20, "gameStateTest");
    }
}
