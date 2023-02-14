package com.enigma.shape;

public class Circle implements Shape {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getSurface() {
        return Math.PI * radius * radius;
    }

    public Double getRound() {
        return 2 * Math.PI * radius;
    }
}
