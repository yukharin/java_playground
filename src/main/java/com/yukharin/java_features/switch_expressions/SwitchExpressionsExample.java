package com.yukharin.java_features.switch_expressions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SwitchExpressionsExample {

    public static void main(String[] args) {
        Pet pet = Pet.CAT;
        var amountOfLegs = defineAmountOfLegs(pet);
        log.info("{} has {} amount of legs", pet, amountOfLegs);
    }

    private static int defineAmountOfLegs(Pet pet) {
        return switch (pet) {
            case CAT, DOG -> {
                log.info(" I am cat or dog");
                yield 4;
            }
            case PARROT -> 2;
            case GOLDFISH -> 0;
        };
    }

    public enum Pet {
        CAT, DOG, PARROT, GOLDFISH
    }

}
