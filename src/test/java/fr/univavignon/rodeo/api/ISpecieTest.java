package fr.univavignon.rodeo.api;

import org.junit.*;
import org.mockito.Mockito;
import java.util.List;

import static org.junit.Assert.*;


public class ISpecieTest {
    protected ISpecie specie;

    @Before
    public void setUp() {
        specie = getInstance();
    }

    protected ISpecie getInstance() {
        specie = MockFactory.getSpecieInstance();
        List<IAnimal> listAnimal = MockFactory.getAnimalList();
        Mockito.when(specie.getArea()).thenReturn(20);
        Mockito.when(specie.getAnimals()).thenReturn(listAnimal);
        Mockito.when(specie.getName()).thenReturn("specieTest");
        return specie;
    }

    @Test
    public void testGetAeras() {
        assertEquals(20, specie.getArea());
    }

    @Test
    public void testGetAnimals() {
        assertEquals(3, specie.getAnimals().size());
    }

    @Test
    public void testGetName() {
        assertEquals("specieTest", specie.getName());
    }
}
