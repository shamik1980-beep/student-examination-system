package com.exam.controller;

import com.exam.model.Student;
import com.exam.view.StudentView;
import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private List<Student> studentList = new ArrayList<>();
    private StudentView view;

    public StudentController(StudentView view) {
        this.view = view;
    }

    public void addStudent(Student student) {
        studentList.add(student);
        view.showMessage("Student added successfully.");
    }

    public Student searchStudentById(int id) {
        for (Student student : studentList) {
            if (student.getStudentId() == id) {
                return student;
            }
        }
        return null;
    }

    public void updateMarks(int id, double newMarks) {
        Student student = searchStudentById(id);
        if (student != null) {
            student.setMarks(newMarks);
            view.showMessage("Marks updated successfully.");
        } else {
            view.showMessage("Student not found.");
        }
    }

    public void displayStudent(int id) {
        Student student = searchStudentById(id);
        if (student != null) {
            view.displayStudentDetails(student);
        } else {
            view.showMessage("Student not found.");
        }
    }

    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            view.showMessage("No student records available.");
            return;
        }

        for (Student student : studentList) {
            view.displayStudentDetails(student);
        }
    }
}
