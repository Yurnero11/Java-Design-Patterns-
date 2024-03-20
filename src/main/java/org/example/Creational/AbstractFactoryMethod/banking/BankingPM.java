package org.example.Creational.AbstractFactoryMethod.banking;

import org.example.Creational.AbstractFactoryMethod.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking projects...");
    }
}
