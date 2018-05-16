package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.api.SpecieLevel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GameState implements IGameState {
    private SpecieLevel specieLevel;
    private int progression;
    private String name;
    private List<Environment> environmentList;
    private Iterator<Environment> environmentIterator;
    private Environment currentEnvironment;
    private List<IAnimal> catchedAnimals = new ArrayList<>();

    public GameState(SpecieLevel specieLevel, int progression, String name, List<Environment> environmentList) {
        this.specieLevel = specieLevel;
        this.progression = progression;
        this.name = name;
        this.environmentList = environmentList;
        this.environmentIterator = this.environmentList.iterator();
    }

    @Override
    public void exploreArea() throws IllegalStateException {
        if (environmentIterator.hasNext()) {
            currentEnvironment = environmentIterator.next();
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public void catchAnimal(IAnimal animal) throws IllegalArgumentException, IllegalStateException {
        if (animal == null) {
            throw new IllegalArgumentException();
        }
        if (currentEnvironment == null) {
            throw new IllegalStateException();
        }
        for (ISpecie specie : currentEnvironment.getSpecies()) {
            for (IAnimal animalSpecie : specie.getAnimals()) {
                if (animalSpecie.getName().equals(animal.getName())) {
                    catchedAnimals.add(animal);
                    return;
                }
            }
        }
        throw new IllegalStateException();
    }

    @Override
    public SpecieLevel getSpecieLevel(ISpecie specie) throws IllegalArgumentException {
        if (specie == null) {
            throw new IllegalArgumentException();
        }
        return specieLevel;
    }

    @Override
    public int getProgression() {
        return progression;
    }

    @Override
    public String getName() {
        return name;
    }
}
