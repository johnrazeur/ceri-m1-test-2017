package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.*;

import java.util.Arrays;
import java.util.List;

public class GameStateTest extends IGameStateTest {
    @Override
    protected IGameState getInstance() {
        List<IAnimal> cats = Arrays.asList(new Animal("cat", true, true, false, 20));
        List<IAnimal> dogs = Arrays.asList(animal2);
        List<IAnimal> lions = Arrays.asList(new Animal("lion", true, true, false, 20));
        List<ISpecie> species = Arrays.asList(
                getSpecie(),
                new Specie(0, cats, "specieCat"),
                new Specie(0, lions, "specieLion")
        );

        List<Environment> environmentList = Arrays.asList(
                new Environment(0, species, "environmentTest")
        );
        return new GameState(SpecieLevel.NOVICE, 20, "gameStateTest", environmentList);
    }

    @Override
    protected ISpecie getSpecie() {
        IAnimal animal = getAnimal2();
        return new Specie(0, Arrays.asList(animal), "specieDog");
    }

    @Override
    protected IAnimal getAnimal2() {
        return new Animal("dog", true, true, false, 20);
    }
}
