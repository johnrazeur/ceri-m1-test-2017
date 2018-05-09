package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.ISpecie;

import java.util.List;

public class Environment implements IEnvironment {
    private int areas;
    private List<ISpecie> species;
    private String name;

    public Environment(int areas, List<ISpecie> species, String name) {
        this.areas = areas;
        this.species = species;
        this.name = name;
    }

    @Override
    public int getAreas() {
        return areas;
    }

    @Override
    public List<ISpecie> getSpecies() {
        return species;
    }

    @Override
    public String getName() {
        return name;
    }
}
