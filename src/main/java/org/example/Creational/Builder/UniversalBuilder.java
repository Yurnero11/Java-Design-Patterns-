package org.example.Creational.Builder;

import java.lang.reflect.Field;

public class UniversalBuilder <T>{
    private T instance;

    public UniversalBuilder(Class<T> tClass) throws InstantiationException, IllegalAccessException {
        instance = tClass.newInstance();
    }

    public UniversalBuilder<T> set(String fieldName, Object value) throws NoSuchFieldException, IllegalAccessException {
        Field field = instance.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(instance, value);
        return this;
    }

    public T build(){
        return instance;
    }
}
