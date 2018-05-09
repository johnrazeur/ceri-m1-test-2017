package fr.univavignon.rodeo.api;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class IGameStateTest {
    protected IGameState gameState;

    protected static IAnimal animal = MockFactory.getAnimal();
    protected static ISpecie spicie = MockFactory.getSpecieInstance();
    @Before
    public void setUp() {
        gameState = getInstance();
    }

    protected IGameState getInstance() {
        gameState = Mockito.mock(IGameState.class);
        Mockito.when(gameState.getProgression()).thenReturn(20);
        Mockito.doThrow(IllegalStateException.class).when(gameState).exploreArea();
        Mockito.doThrow(IllegalStateException.class).when(gameState).catchAnimal(animal);
        Mockito.doThrow(IllegalArgumentException.class).when(gameState).catchAnimal(null);
        Mockito.when(gameState.getSpecieLevel(null)).thenThrow(new IllegalArgumentException());
        Mockito.when(gameState.getSpecieLevel(spicie)).thenReturn(SpecieLevel.NOVICE);
        return gameState;
    }

    @Test(expected=IllegalStateException.class)
    public void testExploreArea()  {
        gameState.exploreArea();
    }

    @Test(expected=IllegalStateException.class)
    public void testCatchAnimalWrongAnimal() {
        gameState.catchAnimal(animal);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testCatchAnimalNull() {
        gameState.catchAnimal(null);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testGetSpecieLevelNull() {
        gameState.getSpecieLevel(null);
    }

    @Test()
    public void testGetSpecieLevelNovice() {
        assertEquals(SpecieLevel.NOVICE, gameState.getSpecieLevel(spicie));
    }

    @Test
    public void testGetProgression() {
        assertEquals(20, gameState.getProgression());
    }

}