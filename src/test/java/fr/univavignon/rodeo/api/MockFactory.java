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

    public static IAnimal getAnimal() {
        IAnimal animal = Mockito.mock(IAnimal.class);
        Mockito.when(animal.getXP()).thenReturn(20);
        Mockito.when(animal.isSecret()).thenReturn(true);
        Mockito.when(animal.isEndangered()).thenReturn(true);
        Mockito.when(animal.isBoss()).thenReturn(false);

        return animal;
    }

    public static List<IAnimal> getAnimalList() {
        IAnimal animal1 = Mockito.mock(IAnimal.class);
        IAnimal animal2 = Mockito.mock(IAnimal.class);
        IAnimal animal3 = Mockito.mock(IAnimal.class);

        ArrayList<IAnimal> listAnimal = new ArrayList<>(3);
        listAnimal.add(animal1);
        listAnimal.add(animal2);
        listAnimal.add(animal3);
        return listAnimal;
    }

    public static IGameState getGameState() {
        IAnimal animal = MockFactory.getAnimal();
        ISpecie spicie = MockFactory.getSpecieInstance();

        IGameState gameState = Mockito.mock(IGameState.class);
        Mockito.when(gameState.getProgression()).thenReturn(20);
        Mockito.doThrow(IllegalStateException.class).when(gameState).exploreArea();
        Mockito.doThrow(IllegalStateException.class).when(gameState).catchAnimal(animal);
        Mockito.doThrow(IllegalArgumentException.class).when(gameState).catchAnimal(null);
        Mockito.when(gameState.getSpecieLevel(null)).thenThrow(new IllegalArgumentException());
        Mockito.when(gameState.getSpecieLevel(spicie)).thenReturn(SpecieLevel.NOVICE);
        return gameState;
    }
}