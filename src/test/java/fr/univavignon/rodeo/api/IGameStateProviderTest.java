package fr.univavignon.rodeo.api;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class IGameStateProviderTest {
    protected IGameStateProvider gameStateProvider;
    @Before
    public void setUp() {
        gameStateProvider = getInstance();
    }

    public IGameStateProvider getInstance() {
        IGameState save = MockFactory.getGameState();
        IGameStateProvider gameStateProvider = Mockito.mock(IGameStateProvider.class);
        Mockito.when(gameStateProvider.get("test")).thenReturn(save);
        return gameStateProvider;
    }


    @Test
    public void testGet() {
        assertEquals(20, gameStateProvider.get("test").getProgression());
    }
}
