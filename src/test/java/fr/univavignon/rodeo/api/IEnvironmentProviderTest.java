package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class IEnvironmentProviderTest {
    protected IEnvironmentProvider environmentProvider;

    @Before
    public void setUp() {
         environmentProvider = getInstance();
    }

    protected IEnvironmentProvider getInstance() {
        IEnvironmentProvider environmentProvider = Mockito.mock(IEnvironmentProvider.class);
        ArrayList<String> environments = new ArrayList<>(3);
        environments.add("savana");
        environments.add("desert");
        environments.add("jungle");

        IEnvironment environment = MockFactory.getEnvironment();
        Mockito.when(environmentProvider.getAvailableEnvironments()).thenReturn(environments);
        Mockito.when(environmentProvider.getEnvironment("savana")).thenReturn(environment);
        Mockito.when(environmentProvider.getEnvironment("vide")).thenReturn(null);
        Mockito.when(environmentProvider.getEnvironment(null)).thenThrow(new IllegalArgumentException());
        return environmentProvider;
    }

    @Test
    public void testGetAvailableEnvironments() {
        assertEquals(3, environmentProvider.getAvailableEnvironments().size());
    }

    @Test
    public void testGetEnvironmentExist() {
        assertNotNull(environmentProvider.getEnvironment("savana"));
    }

    @Test
    public void testGetEnvironmentNotExist() {
        assertNull(environmentProvider.getEnvironment("vide"));
    }

    @Test(expected=IllegalArgumentException.class)
    public void testGetEnvironmentNull() {
        environmentProvider.getEnvironment(null);
    }
}
