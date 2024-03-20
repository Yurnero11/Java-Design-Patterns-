package org.example.Stractural.Adapter;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase = new Adapter();
        dataBase.insert();
        dataBase.update();
        dataBase.select();
        dataBase.remove();
    }
}
