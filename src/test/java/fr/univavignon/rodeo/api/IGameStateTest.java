package fr.univavignon.rodeo.api;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class IGameStateTest {
    protected IGameState gameState;

    @Before
    public void setUp() {
        getInstance();
    }

    protected void getInstance() {
        gameState = Mockito.mock(IGameState.class);
        Mockito.when(gameState.getProgression()).thenReturn(20);
    }

    @Test
    public void exploreArea() throws Exception {
    }

    @Test
    public void catchAnimal() throws Exception {
    }

    @Test
    public void getSpecieLevel() throws Exception {
    }

    @Test
    public void getProgression() throws Exception {
        assertEquals(20, gameState.getProgression());
    }

}