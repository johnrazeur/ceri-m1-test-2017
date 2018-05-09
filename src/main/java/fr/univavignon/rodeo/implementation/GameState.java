package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.api.SpecieLevel;

public class GameState implements IGameState {
    private SpecieLevel specieLevel;
    private int progression;
    private String name;

    public GameState(SpecieLevel specieLevel, int progression, String name) {
        this.specieLevel = specieLevel;
        this.progression = progression;
        this.name = name;
    }

    @Override
    public void exploreArea() throws IllegalStateException {

    }

    @Override
    public void catchAnimal(IAnimal animal) throws IllegalArgumentException, IllegalStateException {
        if (animal == null) {
            throw new IllegalArgumentException();
        }
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
