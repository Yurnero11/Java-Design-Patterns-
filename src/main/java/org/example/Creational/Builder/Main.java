package org.example.Creational.Builder;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        // Universal builder
        /*UniversalBuilder<Person> universalBuilder = new UniversalBuilder<>(Person.class);
        Person person = universalBuilder.set("age", 25)
                .set("name", "Yura")
                .set("phone", 12)
                .build();
        System.out.println(person);*/

        // Default Person builder
        Person person = new PersonBuilder()
                .setName("Yura")
                .setAge(20)
                .setPhone(1111)
                .build();
        System.out.println(person);
    }
}
