package com.enigma.schoolReport.model;

public class Student {
    private String NIM;
    private String name;
    private int age;
    private String address;
    private Raport raport;

    public Student(String NIM, String name, int age, String address) {
        this.NIM = NIM;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getNIM() {
        return NIM;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Raport getRaport() {
        return raport;
    }

    public void setRaport(Raport raport) {
        this.raport = raport;
    }

    @Override
    public String toString() {
        return "Student{" +
                "NIM='" + NIM + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", raport=" + raport +
                '}';
    }
}
