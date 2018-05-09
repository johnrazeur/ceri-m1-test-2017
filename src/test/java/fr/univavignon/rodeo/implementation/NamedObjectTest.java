package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.INamedObject;
import fr.univavignon.rodeo.api.INamedObjectTest;

public class NamedObjectTest extends INamedObjectTest {
    @Override
    protected INamedObject getInstance() {
        return new NamedObject("test");
    }
}
