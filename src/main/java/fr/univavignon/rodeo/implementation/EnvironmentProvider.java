package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;

import java.util.List;

public class EnvironmentProvider implements IEnvironmentProvider {
    private List<String> availableEnvironments;
    private IEnvironment environment;

    public EnvironmentProvider(List<String> availableEnvironments, IEnvironment environment) {
        this.availableEnvironments = availableEnvironments;
        this.environment = environment;
    }

    @Override
    public List<String> getAvailableEnvironments() {
        return availableEnvironments;
    }

    @Override
    public IEnvironment getEnvironment(String name) throws IllegalArgumentException {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        return environment;
    }
}
