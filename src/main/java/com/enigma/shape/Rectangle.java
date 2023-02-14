package com.enigma.shape;

public class Rectangle implements Shape {
    private Double length;
    private Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    public Double getSurface() {
        return length * width;
    }

    public Double getRound() {
        return 2 * (length + width);
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
}
