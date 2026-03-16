package com.exam.view;

import com.exam.model.Student;

public class StudentView {

    public void displayStudentDetails(Student student) {
        System.out.println("----- Student Examination Details -----");
        System.out.println("Student ID : " + student.getStudentId());
        System.out.println("Name       : " + student.getName());
        System.out.println("Subject    : " + student.getSubject());
        System.out.println("Marks      : " + student.getMarks());
        System.out.println("Result     : " + student.getResult());
        System.out.println("---------------------------------------");
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
