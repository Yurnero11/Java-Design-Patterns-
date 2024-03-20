package org.example.Stractural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    public static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpeciality(String speciality){
        Developer developer = developers.get(speciality);

        if (developer == null){
            switch (speciality){
                case "java" :
                    System.out.println("Hiring java developer....");
                    developer = new JavaDeveloper();
                    break;
                case "cpp":
                    System.out.println("Hiring cpp developer");
                    developer = new CppDeveloper();
            }
            developers.put(speciality, developer);
        }
        return developer;
    }
}
