package com.enigma.schoolReport.controller;

import com.enigma.schoolReport.model.Raport;
import com.enigma.schoolReport.model.Student;
import com.enigma.schoolReport.repo.StudentRepo;
import com.enigma.schoolReport.service.StudentService;

public class App {
    private void print(Student[] students) {
        System.out.println("\n=== INFORMASI SISWA ===\n");

        for (Student student: students) {
            System.out.println("NIM\t\t\t: " + student.getNIM());
            System.out.println("Nama Siswa\t: " + student.getName());
            System.out.println("Alamat\t\t: " + student.getAddress());
            System.out.println("\nLaporan Nilai Siswa");
            System.out.println("B. Indonesia\t: " + student.getRaport().getbIndonesia());
            System.out.println("B. Inggris\t\t: " + student.getRaport().getbInggris());
            System.out.println("Matematika\t\t: " + student.getRaport().getMatematika());
            System.out.println("IPA\t\t\t\t: " + student.getRaport().getIPA());
            System.out.println("GPA\t\t\t\t: " + student.getRaport().getGPA());

            System.out.println("\n===============\n");
        }
    }

    public void run() {
        StudentRepo studentRepo = new StudentRepo();
        StudentService studentService = new StudentService(studentRepo);

        Student student1 = new Student("A001", "Budi Hartono", 21, "Bandung");
        Raport studentRaport1 = new Raport();

        studentRaport1.setbIndonesia(90.29);
        studentRaport1.setbInggris(60.43);
        studentRaport1.setMatematika(78.01);
        studentRaport1.setIPA(87.90);

        student1.setRaport(studentRaport1);

        studentService.registerStudent(student1);

        // Student 2
        Student student2 = new Student("A002", "Bude Hartini", 22, "Ciamis");
        Raport studentRaport2 = new Raport();

        studentRaport2.setbIndonesia(80.39);
        studentRaport2.setbInggris(70.45);
        studentRaport2.setMatematika(68.25);
        studentRaport2.setIPA(90.93);

        student2.setRaport(studentRaport2);

        studentService.registerStudent(student2);

        print(studentService.getStudents());
    }


}
