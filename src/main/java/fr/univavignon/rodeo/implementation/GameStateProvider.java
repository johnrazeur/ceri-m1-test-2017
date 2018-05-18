package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateProvider;

public class GameStateProvider implements IGameStateProvider {
    private IGameState gameState;

    public GameStateProvider(IGameState gameState) {
        this.gameState = gameState;
    }

    @Override
    public void save(IGameState gameState) {
        System.out.println("sauvegarde");
    }

    @Override
    public IGameState get(String name) throws IllegalArgumentException {
        return gameState;
    }
}
