package com.fabioqmarsiaj.designpatterns.factory;

public interface Pet {
    String getName();

    void setName(String name);

    String getType();

    boolean isHungry();

    void feed();
}
