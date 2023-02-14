package com.enigma.shape;

public class Main {
    public static void main(String[] args) {
        Block balok = new Block(4.0, 5.0, 3.0);

        System.out.println(balok.getVolume());
        System.out.println(balok.getSurface());
        System.out.println(balok.getRound());

        Rectangle rectangle = new Rectangle(10.0, 8.0);

        System.out.println(rectangle.getSurface());
        System.out.println(rectangle.getRound());

        Circle circle = new Circle(10.0);
        circle.getRound();
        circle.getSurface();
    }
}
