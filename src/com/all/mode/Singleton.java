package com.all.mode;

public class Singleton {
    private final static Singleton INSTANCE = new Singleton();
    private Singleton(){
        ;
    }
    public void print(){
        System.out.println("This is a singleton program!");
    }

    public static Singleton getInstance(){
        return INSTANCE;
    }
}
