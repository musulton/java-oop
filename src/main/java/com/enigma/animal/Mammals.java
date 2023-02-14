package com.enigma.animal;

public abstract class Mammals extends Animal {
    final static String group = "Mamalia";

    public Mammals(String name) {
        super(name);
    }

    public void breed() {
        System.out.println("Hewan " + group + " dengan cara melahirkan");
    }

    @Override
    public void sound() {
        System.out.println("Bersuara");
    }
}
