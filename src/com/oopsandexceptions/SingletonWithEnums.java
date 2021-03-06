package com.oopsandexceptions;

public enum SingletonWithEnums {
//lazy loading not possible
    INSTANCE;
    int value;

    public int getValue() {

        return value;

    }
    public void setValue(int value) {

        this.value = value;

    }
    
    private SingletonWithEnums() {
        System.out.println("Here");
    }
}