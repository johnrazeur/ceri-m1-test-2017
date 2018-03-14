package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.Mockito;
import static org.junit.Assert.*;

public class IAnimalTest {
    private IAnimal animal;

    @Before
    public void setUp() {
        animal = getInstance();
    }

    private IAnimal getInstance() {
        IAnimal animal = Mockito.mock(IAnimal.class);
        Mockito.when(animal.getXP()).thenReturn(20);
        Mockito.when(animal.isSecret()).thenReturn(true);
        Mockito.when(animal.isEndangered()).thenReturn(true);
        Mockito.when(animal.isBoss()).thenReturn(false);

        return animal;
    }

    @Test
    public void testGetXp() {
        assertEquals(20, animal.getXP());
    }

    @Test
    public void testIsSecret() {
        assertTrue(animal.isSecret());
    }

    @Test
    public void testIsEndangered() {
        assertTrue(animal.isEndangered());
    }

    @Test
    public void testIsBoss() {
        assertFalse(animal.isBoss());
    }
}
