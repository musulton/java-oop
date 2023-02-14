package com.enigma.schoolReport.service;

import com.enigma.schoolReport.model.Student;
import com.enigma.schoolReport.repo.StudentRepo;

public class StudentService {
    StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void registerStudent(Student student) {
        Student[] students = this.getStudents();

        for (Student s : students) {
            if (student.getNIM().equals(s.getNIM())) {
                System.out.println("Gagal input siswa, NIM sudah digunakan!");
                return;
            }
        }

        this.studentRepo.addStudent(student);
    }

    public Student[] getStudents() {
        return this.studentRepo.getStudents();
    }
}
