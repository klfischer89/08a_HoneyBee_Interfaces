package com.cc.java.interfaces;

public interface Flyable {

    public abstract String fly();  

    default String canFly(){
        return "I can FLY!";
    }

}
