package fr.univavignon.rodeo.api;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;


public class INamedObjectTest {
    private INamedObject namedObject;

    @Before
    public void setUp() {
        namedObject = getInstance();
    }

    private INamedObject getInstance() {
        INamedObject animal = Mockito.mock(INamedObject.class);
        Mockito.when(animal.getName()).thenReturn("test");

        return animal;
    }

    @Test
    public void testGetInstance() {
        assertEquals("test", namedObject.getName());
    }
}
