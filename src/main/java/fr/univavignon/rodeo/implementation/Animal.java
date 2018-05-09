package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.IAnimal;

public class Animal implements IAnimal {

    private boolean secret;
    private boolean endangered;
    private boolean boss;
    private String name;
    private int xp;

    public Animal(String name, boolean secret, boolean endangered, boolean boss, int xp) {
        this.name = name;
        this.secret = secret;
        this.endangered = endangered;
        this.boss = boss;
        this.xp = xp;
    }

    @Override
    public int getXP() {
        return xp;
    }

    @Override
    public boolean isSecret() {
        return secret;
    }

    @Override
    public boolean isEndangered() {
        return endangered;
    }

    @Override
    public boolean isBoss() {
        return boss;
    }

    @Override
    public String getName() {
        return name;
    }
}
