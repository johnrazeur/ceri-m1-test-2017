package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.*;

import java.util.Arrays;
import java.util.List;

public class GameStateProviderTest extends IGameStateProviderTest{
    public IGameStateProvider getInstance() {
        List<IAnimal> cats = Arrays.asList(new Animal("cat", true, true, false, 20));
        List<IAnimal> dogs = Arrays.asList(new Animal("dog", true, true, false, 20));
        List<IAnimal> lions = Arrays.asList(new Animal("lion", true, true, false, 20));
        List<ISpecie> species = Arrays.asList(
                new Specie(0, cats, "specieCat"),
                new Specie(0, dogs, "specieDog"),
                new Specie(0, lions, "specieLion")
        );

        List<Environment> environmentList = Arrays.asList(
                new Environment(0, species, "environmentTest")
        );

        IGameState save = new GameState(SpecieLevel.NOVICE, 20, "testSave", environmentList);
        IGameStateProvider gameStateProvider = new GameStateProvider(save);
        return gameStateProvider;
    }
}
