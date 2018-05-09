package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.ISpecie;

import java.util.List;

public class Specie implements ISpecie {
    private int aera;
    private List<IAnimal> animals;
    private String name;

    public Specie(int aera, List<IAnimal> animals, String name) {
        this.aera = aera;
        this.animals = animals;
        this.name = name;
    }

    @Override
    public int getArea() {
        return aera;
    }

    @Override
    public List<IAnimal> getAnimals() {
        return animals;
    }

    @Override
    public String getName() {
        return name;
    }
}
