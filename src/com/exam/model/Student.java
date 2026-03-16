package com.exam.model;

public class Student {
    private int studentId;
    private String name;
    private String subject;
    private double marks;

    public Student(int studentId, String name, String subject, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.subject = subject;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getResult() {
        return marks >= 40 ? "Pass" : "Fail";
    }
}
