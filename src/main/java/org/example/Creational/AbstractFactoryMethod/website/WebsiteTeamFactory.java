package org.example.Creational.AbstractFactoryMethod.website;

import org.example.Creational.AbstractFactoryMethod.Developer;
import org.example.Creational.AbstractFactoryMethod.ProjectManager;
import org.example.Creational.AbstractFactoryMethod.ProjectTeamFactory;
import org.example.Creational.AbstractFactoryMethod.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
