package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.*;

import java.util.Arrays;
import java.util.List;

public class EnvironmentProviderTest extends IEnvironmentProviderTest {
    @Override
    protected IEnvironmentProvider getInstance() {
        List<String> environments = Arrays.asList("savana", "desert", "jungle");
        List<IAnimal> animals = Arrays.asList();
        List<ISpecie> species = Arrays.asList(
                new Specie(0, animals, "specie1"),
                new Specie(0, animals, "specie2"),
                new Specie(0, animals, "specie3")
        );
        IEnvironment environment = new Environment(20, species, "environmentTest");
        return new EnvironmentProvider(environments, environment);
    }
}
