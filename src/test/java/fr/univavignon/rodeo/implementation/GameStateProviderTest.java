package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.*;

public class GameStateProviderTest extends IGameStateProviderTest{
    public IGameStateProvider getInstance() {
        IGameState save = new GameState(SpecieLevel.NOVICE, 20, "testSave");
        IGameStateProvider gameStateProvider = new GameStateProvider(save);
        return gameStateProvider;
    }
}
