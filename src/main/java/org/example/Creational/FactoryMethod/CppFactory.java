package org.example.Creational.FactoryMethod;

public class CppFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
