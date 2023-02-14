package com.enigma.moba;

public class Armor {
    private double defencePower;
    private String name;

    public Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    public double getDefencePower() {
        return this.defencePower;
    }

    @Override
    public String toString() {
        return "Armor{" +
                "defencePower=" + defencePower +
                ", name='" + name + '\'' +
                '}';
    }
}
