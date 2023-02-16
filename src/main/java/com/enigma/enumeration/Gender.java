package com.enigma.enumeration;

public enum Gender {
    PRIA, WANITA, OTHER;

    public void getId() {
        switch (this) {
            case PRIA -> System.out.println(PRIA.ordinal());
            case WANITA -> System.out.println(WANITA.ordinal());
            default -> System.out.println("");
        }
    }
}
