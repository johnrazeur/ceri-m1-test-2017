package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentTest;
import fr.univavignon.rodeo.api.ISpecie;

import java.util.Arrays;
import java.util.List;

public class EnvironmentTest extends IEnvironmentTest {
    @Override
    protected IEnvironment getInstance() {
        List<IAnimal> animals = Arrays.asList();
        List<ISpecie> species = Arrays.asList(
                new Specie(0, animals, "specie1"),
                new Specie(0, animals, "specie2"),
                new Specie(0, animals, "specie3")
        );
        return new Environment(20, species, "environmentTest");
    }
}
