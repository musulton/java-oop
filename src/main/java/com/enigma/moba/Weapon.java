package com.enigma.moba;

public class Weapon {
    private double attackPower;
    private String name;

    public Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    public double getAttackPower() {
        return this.attackPower;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "attackPower=" + attackPower +
                ", name='" + name + '\'' +
                '}';
    }
}
