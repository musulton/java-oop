package com.enigma.animal;

public abstract class Bird extends Animal {
    final static String group = "Bird";

    public Bird(String name) {
        super(name);
    }

    public void breed() {
        System.out.println("Hewan " + group + " dengan cara bertelur");
    }
}
