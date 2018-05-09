package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IAnimalTest;

public class AnimalTest extends IAnimalTest {
    @Override
    protected final IAnimal getInstance() {
        return new Animal("testAnimal", true, true, false, 20);
    }
}
