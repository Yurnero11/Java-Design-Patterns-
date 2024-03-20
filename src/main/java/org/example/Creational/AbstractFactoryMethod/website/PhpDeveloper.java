package org.example.Creational.AbstractFactoryMethod.website;

import org.example.Creational.AbstractFactoryMethod.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
