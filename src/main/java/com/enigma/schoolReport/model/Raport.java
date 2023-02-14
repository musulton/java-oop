package com.enigma.schoolReport.model;

import com.enigma.schoolReport.utils.Validation;

public class Raport{
    private double bIndonesia;
    private double bInggris;
    private double matematika;
    private double IPA;

    public double getbIndonesia() {
        return bIndonesia;
    }

    public double getbInggris() {
        return bInggris;
    }

    public double getMatematika() {
        return matematika;
    }

    public double getIPA() {
        return IPA;
    }

    public double getGPA() {
        return (this.bIndonesia + this.bInggris + this.matematika + this.IPA) / 4;
    }

    public void setbIndonesia(double bIndonesia) {
        this.bIndonesia = Validation.score(bIndonesia);
    }

    public void setbInggris(double bInggris) {
        this.bInggris = Validation.score(bInggris);
    }

    public void setMatematika(double matematika) {
        this.matematika = Validation.score(matematika);
    }

    public void setIPA(double IPA) {
        this.IPA = Validation.score(IPA);
    }

    @Override
    public String toString() {
        return "Raport{" +
                "bIndonesia=" + bIndonesia +
                ", bInggris=" + bInggris +
                ", matematika=" + matematika +
                ", IPA=" + IPA +
                '}';
    }
}
