package org.example.Creational.AbstractFactoryMethod.banking;

import org.example.Creational.AbstractFactoryMethod.Developer;
import org.example.Creational.AbstractFactoryMethod.ProjectManager;
import org.example.Creational.AbstractFactoryMethod.ProjectTeamFactory;
import org.example.Creational.AbstractFactoryMethod.Tester;


public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
