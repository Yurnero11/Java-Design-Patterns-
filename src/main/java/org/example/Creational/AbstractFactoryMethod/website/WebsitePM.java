package org.example.Creational.AbstractFactoryMethod.website;

import org.example.Creational.AbstractFactoryMethod.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
