package com.enigma.animal;

public abstract class Reptile extends Animal {
    final static String group = "Reptile";

    public Reptile(String name) {
        super(name);
    }

    public void breed() {
        System.out.println("Hewan " + group + " dengan cara ovovivivar");
    }
}
