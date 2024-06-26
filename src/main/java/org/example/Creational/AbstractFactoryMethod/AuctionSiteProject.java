package org.example.Creational.AbstractFactoryMethod;

import org.example.Creational.AbstractFactoryMethod.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating website...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
