package com.enigma.animal;

public class Snake extends Reptile {
    public Snake(String name) {
        super(name);
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println(this.name + " bersuara psssstttt");
    }
}
