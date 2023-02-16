package com.enigma.enumeration;

public class Main {
    public static void main(String[] args) {
        Gender[] enumArr = Gender.values();

        for (Gender g: enumArr) {
            System.out.println(g);
        }
    }
}
