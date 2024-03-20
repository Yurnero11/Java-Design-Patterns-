package org.example.Stractural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developerList = new ArrayList<>();
        developerList.add(developerFactory.getDeveloperBySpeciality("java"));
        developerList.add(developerFactory.getDeveloperBySpeciality("java"));
        developerList.add(developerFactory.getDeveloperBySpeciality("java"));
        developerList.add(developerFactory.getDeveloperBySpeciality("java"));
        developerList.add(developerFactory.getDeveloperBySpeciality("java"));
        developerList.add(developerFactory.getDeveloperBySpeciality("java"));
        developerList.add(developerFactory.getDeveloperBySpeciality("cpp"));
        developerList.add(developerFactory.getDeveloperBySpeciality("cpp"));
        developerList.add(developerFactory.getDeveloperBySpeciality("cpp"));
        developerList.add(developerFactory.getDeveloperBySpeciality("cpp"));
        developerList.add(developerFactory.getDeveloperBySpeciality("cpp"));

        for (Developer developer: developerList){
            developer.writeCode();
        }

    }
}
