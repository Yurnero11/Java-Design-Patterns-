package org.example.Creational.FactoryMethod;

public class PhpFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
