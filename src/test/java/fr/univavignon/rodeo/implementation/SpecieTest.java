package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.api.ISpecieTest;

import java.util.Arrays;
import java.util.List;

public class SpecieTest extends ISpecieTest {
    @Override
    protected ISpecie getInstance() {
        List<IAnimal> animals = Arrays.asList(
                new Animal("animal1", false, false, false, 0),
                new Animal("animal2", false, false, false, 0),
                new Animal("animal3", false, false, false, 0)
        );
        return new Specie(20, animals, "specieTest");
    }
}
