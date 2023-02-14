package com.enigma.shape;

public class Block extends Rectangle {
    private Double height;

    public Double getVolume() {
        return this.getLength() * this.getWidth() * this.height;
    }

    public Block(Double length, Double width, Double height) {
        super(length, width);
        this.height = height;
    }
}
