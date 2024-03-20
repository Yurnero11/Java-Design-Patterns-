package org.example.Creational.FactoryMethod;


public class Main {
    public static void main(String[] args) {
        /*DeveloperFactory developerFactory = createDeveloperByName("cpp");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();*/
    }

    /*static DeveloperFactory createDeveloperByName(String developerName){
        if (developerName.equalsIgnoreCase("java")){
            return new JavaFactory();
        }else if (developerName.equalsIgnoreCase("cpp")){
            return new CppFactory();
        }else if (developerName.equalsIgnoreCase("php")){
            return new PhpFactory();
        }else {
            throw new RuntimeException(developerName + " not found...");
        }
    }*/
}
