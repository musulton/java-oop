package com.enigma.animal;

public class Cat extends Mammals {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println(this.name + " bersuara meow");
    }
}
