package org.example.Stractural.Adapter;

public class Adapter extends JavaDeveloper implements DataBase{
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        selectObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
