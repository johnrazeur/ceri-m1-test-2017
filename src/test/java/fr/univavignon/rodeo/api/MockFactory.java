package fr.univavignon.rodeo.api;

import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class MockFactory {
    public static ISpecie getSpecieInstance() {
        ISpecie specie = Mockito.mock(ISpecie.class);
        Mockito.when(specie.getArea()).thenReturn(10);
        return specie;
    }

    public static List<ISpecie> getSpecieList() {
        ISpecie specie1 = Mockito.mock(ISpecie.class);
        Mockito.when(specie1.getArea()).thenReturn(10);

        ISpecie specie2 = Mockito.mock(ISpecie.class);
        Mockito.when(specie2.getArea()).thenReturn(20);

        ISpecie specie3 = Mockito.mock(ISpecie.class);
        Mockito.when(specie3.getArea()).thenReturn(30);

        ArrayList<ISpecie> listSpecies = new ArrayList<>(3);

        listSpecies.add(specie1);
        listSpecies.add(specie2);
        listSpecies.add(specie3);

        return listSpecies;
    }

    public static IEnvironment getEnvironment() {
        IEnvironment environment = Mockito.mock(IEnvironment.class);
        Mockito.when(environment.getAreas()).thenReturn(10);
        List<ISpecie> species = getSpecieList();
        Mockito.when(environment.getSpecies()).thenReturn(species);
        return environment;
    }
}