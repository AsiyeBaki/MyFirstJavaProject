package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Student extends Person {

    private char grade;
    private String studentId;


    public Student(String name, char gender, LocalDate DOB, char grade, String studentId) {  // this is how we add additional variables to the constructor
        super(name, gender, DOB);
        setGrade(grade);
        setStudentId(studentId);
    }     // when we use right click ->  constructor it wil set Parents constructor and childs additional variables


    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void study() {
        System.out.println(" is studying");
    }


}
