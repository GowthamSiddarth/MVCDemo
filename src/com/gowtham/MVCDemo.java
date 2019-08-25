package com.gowtham;

import com.gowtham.controller.StudentController;
import com.gowtham.model.Student;
import com.gowtham.view.StudentView;

public class MVCDemo {

    public static void main(String[] args) {
        Student student = loadStudent();
        StudentView studentView = new StudentView();

        StudentController studentController = new StudentController(student, studentView);
        studentController.updateStudentView();

        studentController.setStudentName("Gowtham");
        studentController.setStudentRollNum("506");
        studentController.updateStudentView();
    }

    static Student loadStudent() {
        Student student = new Student();
        student.setRollNum("1");
        student.setName("gowtham");

        return student;
    }
}
