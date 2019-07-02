package com.learn.java.predicate;

public class Apple {

    private final int weight;
    private final AppleColor color;

    public Apple(int weight, AppleColor color) {
        this.weight = weight;
        this.color = color;
    }

    public AppleColor getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}

