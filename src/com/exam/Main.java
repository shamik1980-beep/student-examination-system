package com.exam;

import com.exam.controller.StudentController;
import com.exam.model.Student;
import com.exam.view.StudentView;

public class Main {
    public static void main(String[] args) {
        StudentView view = new StudentView();
        StudentController controller = new StudentController(view);

        // branch- add students updated with StudentsController Class 

        controller.addStudent(new Student(101, "Amit", "Mathematics", 78));
        controller.addStudent(new Student(102, "Riya", "Physics", 35));
        controller.addStudent(new Student(103, "Sohan", "Chemistry", 64));

        controller.displayAllStudents();
        controller.displayStudent(102);
        controller.updateMarks(102, 55);
        controller.displayStudent(102);
    }
}
