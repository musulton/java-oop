package com.enigma.animal;

// protected -> hanya dapat dibaca dan ditulis didalam kelas dan turunannya

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name + " bisa makan");
    }

    public void sound() {
        System.out.println("Bersuara");
    }

    public abstract void breed();
}
