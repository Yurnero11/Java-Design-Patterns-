package org.example.Creational.Builder;

public class PersonBuilder {
    private int age;
    private String name;
    private int phone;

    public PersonBuilder setAge(int age){
        this.age = age;
        return this;
    }

    public PersonBuilder setName(String name){
        this.name = name;
        return this;
    }

    public PersonBuilder setPhone(int phone){
        this.phone = phone;
        return this;
    }

    public Person build(){
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setPhone(phone);
        return person;
    }
}
