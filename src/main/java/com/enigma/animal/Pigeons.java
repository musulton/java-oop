package com.enigma.animal;

public class Pigeons extends Bird {
    public Pigeons(String name) {
        super(name);
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println(this.name + " bersuara kur kur kur");
    }
}
