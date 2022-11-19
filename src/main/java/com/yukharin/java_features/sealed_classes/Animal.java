package com.yukharin.java_features.sealed_classes;

public abstract sealed class Animal permits Dog, Cat, Frog {

    public abstract String getAnimalName();

}
