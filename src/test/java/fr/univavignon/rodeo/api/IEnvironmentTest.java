package fr.univavignon.rodeo.api;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;


public class IEnvironmentTest {
    protected IEnvironment environment;

    @Before
    public void setUp() {
        environment = getInstance();
    }

    protected IEnvironment getInstance() {
        IEnvironment environment = Mockito.mock(IEnvironment.class);
        Mockito.when(environment.getAreas()).thenReturn(20);
        List<ISpecie> species = MockFactory.getSpecieList();
        Mockito.when(environment.getSpecies()).thenReturn(species);
        Mockito.when(environment.getName()).thenReturn("environmentTest");
        return environment;
    }

    @Test
    public void testGetAreas() {
        assertEquals(20, environment.getAreas());
    }

    @Test
    public void testGetSpecies() {
        assertEquals(3, environment.getSpecies().size());
    }

    @Test
    public void testGetName() {
        assertEquals("environmentTest", environment.getName());
    }
}
