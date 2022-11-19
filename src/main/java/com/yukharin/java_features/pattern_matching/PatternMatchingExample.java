package com.yukharin.java_features.pattern_matching;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PatternMatchingExample {

    public static void main(String[] args) {
        var object = new Hedgehog();
        defineWhatThisAnimalIs(object);
    }

    private static void defineWhatThisAnimalIs(Object object) {
        if (object instanceof Cat obj) {
            log.info(" I am cat {}", obj);
        } else if (object instanceof Dog obj) {
            log.info("I am dog {}", obj);
        } else if (object instanceof Frog obj) {
            log.info("I am frog {}", obj);
        } else if (object instanceof Hedgehog obj) {
            log.info("I am hedgehog {}", obj);
        }
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Frog {
    }

    public static class Hedgehog {
    }
}
