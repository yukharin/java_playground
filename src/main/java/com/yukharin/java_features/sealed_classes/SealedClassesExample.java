package com.yukharin.java_features.sealed_classes;

import lombok.extern.slf4j.Slf4j;

import java.util.stream.Stream;

@Slf4j
public class SealedClassesExample {

    public static void main(String[] args) {
        Stream.of(new Cat(), new Dog(), new Frog()).forEach(animal -> log.info("Animal: {}", animal.getAnimalName()));
    }
}
