package com.learn.java.predicate;

import sun.java2d.pipe.AlphaPaintPipe;

import java.util.function.Predicate;

public final class ApplePredicates {
    private ApplePredicates() {
        // utility class, intentionally just to see how some static can exists in utility classes
    }

    public final static Predicate<Apple> GREEN_APPLE_PREDICATE = new Predicate<Apple>() {
        public boolean test(Apple apple) {
            return false; // todo implement me and change to lambda
        }
    };
}
