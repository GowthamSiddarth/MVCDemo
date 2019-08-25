package com.gowtham.controller;

import com.gowtham.model.Student;
import com.gowtham.view.StudentView;

public class StudentController {
    public StudentView studentView;
    public Student student;

    public StudentController(Student student, StudentView studentView) {
        this.student = student;
        this.studentView = studentView;
    }

    public void setStudentName(String studentName) {
        student.setName(studentName);
    }

    public String getStudentName() {
        return student.getName();
    }

    public void setStudentRollNum(String studentRollNum) {
        student.setRollNum(studentRollNum);
    }

    public String getStudentRollNum() {
        return student.getRollNum();
    }

    public void updateStudentView() {
        studentView.viewStudentData(student);
    }
}
