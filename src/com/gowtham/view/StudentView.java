package com.gowtham.view;

import com.gowtham.model.Student;

public class StudentView {

    public void viewStudentData(Student student) {
        System.out.println(student.getName() + ", " + student.getRollNum());
    }
}
