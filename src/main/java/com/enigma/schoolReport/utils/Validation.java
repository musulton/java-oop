package com.enigma.schoolReport.utils;

public class Validation {
    public static double score(double score) {
        if (score > 100) {
            System.out.println("Score tidak valid!");
            return 0;
        }

        return score;
    }
}
