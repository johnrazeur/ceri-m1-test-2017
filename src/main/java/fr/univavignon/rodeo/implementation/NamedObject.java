package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.INamedObject;

public class NamedObject implements INamedObject {
    private String name;

    public NamedObject(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
