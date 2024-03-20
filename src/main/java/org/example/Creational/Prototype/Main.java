package org.example.Creational.Prototype;

public class Main {
    public static void main(String[] args) {
        Project master = new Project(1, "project", "source code");
        System.out.println(master);

        ProjectFactory projectFactory = new ProjectFactory(master);
        Project project = projectFactory.cloneProject();
        System.out.println(project);
    }
}
