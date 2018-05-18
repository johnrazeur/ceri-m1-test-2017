package fr.univavignon.rodeo.api;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class IGameStateProviderTest {
    protected IGameStateProvider gameStateProvider;
    private IGameState save;
    @Before
    public void setUp() {
        save = MockFactory.getGameState();
        gameStateProvider = getInstance();
    }

    public IGameStateProvider getInstance() {
        IGameStateProvider gameStateProvider = Mockito.mock(IGameStateProvider.class);
        Mockito.when(gameStateProvider.get("test")).thenReturn(save);
        Mockito.doNothing().when(gameStateProvider).save(save);
        return gameStateProvider;
    }

    @Test
    public void testGet() {
        assertEquals(20, gameStateProvider.get("test").getProgression());
    }

    @Test
    public void testSave() {
        gameStateProvider.save(save);
    }
}
