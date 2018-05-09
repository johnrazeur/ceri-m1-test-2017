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

    protected IAnimal getInstance() {
        return MockFactory.getAnimal();
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
