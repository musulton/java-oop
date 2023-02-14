package com.enigma.schoolReport.repo;

import com.enigma.schoolReport.model.Student;

public class StudentRepo {
    private Student[] students = new Student[0];

    public void addStudent(Student data) {
        int n = this.students.length;
        Student[] newArr = new Student[n+1];

        for (int i = 0; i<n; i++) {
            newArr[i] =this.students[i];
        }
        newArr[n] = data;

        this.students = newArr;
    }

    public Student[] getStudents() {
        return this.students;
    }
}
