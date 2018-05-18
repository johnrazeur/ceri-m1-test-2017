package fr.univavignon.rodeo.api;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class IGameStateTest {
    protected IGameState gameState;

    protected static IAnimal animal = MockFactory.getAnimal();
    protected static IAnimal animal2;
    protected static ISpecie spicie;
    @Before
    public void setUp() {
        animal2 = getAnimal2();
        spicie = getSpecie();
        gameState = getInstance();
    }

    protected IGameState getInstance() {
        gameState = Mockito.mock(IGameState.class);
        Mockito.when(gameState.getProgression()).thenReturn(20);
        Mockito.doNothing().doNothing().doThrow(IllegalStateException.class).when(gameState).exploreArea();
        Mockito.doNothing().when(gameState).catchAnimal(animal2);
        Mockito.doThrow(IllegalStateException.class).when(gameState).catchAnimal(animal);
        Mockito.doThrow(IllegalArgumentException.class).when(gameState).catchAnimal(null);
        Mockito.when(gameState.getSpecieLevel(null)).thenThrow(new IllegalArgumentException());
        Mockito.when(gameState.getSpecieLevel(spicie)).thenReturn(SpecieLevel.NOVICE);
        Mockito.when(gameState.getName()).thenReturn("gameStateTest");
        return gameState;
    }

    protected IAnimal getAnimal2() {
        return MockFactory.getAnimal2();
    }

    protected ISpecie getSpecie() {
        return MockFactory.getSpecieInstance();
    }

    @Test()
    public void testExploreArea()  {
        gameState.exploreArea();
    }


    @Test(expected=IllegalStateException.class)
    public void testExploreAreaException()  {
        gameState.exploreArea();
        gameState.exploreArea();
        gameState.exploreArea();
    }

    @Test()
    public void testCatchAnimal() {
        gameState.exploreArea();
        gameState.catchAnimal(animal2);
    }

    @Test(expected=IllegalStateException.class)
    public void testCatchAnimalWrongAnimalNotExplore() {
        gameState.catchAnimal(animal);
    }

    @Test(expected=IllegalStateException.class)
    public void testCatchAnimalWrongAnimal() {
        gameState.exploreArea();
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
        SpecieLevel specieLevel = gameState.getSpecieLevel(spicie);
        assertEquals(SpecieLevel.NOVICE, specieLevel);
        assertEquals(SpecieLevel.NOVICE.getRequiredXP(), specieLevel.getRequiredXP());
    }

    @Test
    public void testGetProgression() {
        assertEquals(20, gameState.getProgression());
    }

    @Test
    public void testGetName() {
        assertEquals("gameStateTest", gameState.getName());
    }
}