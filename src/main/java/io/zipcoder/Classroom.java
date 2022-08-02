package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Classroom {
    Student[] students;
    Map<Student, String> gradeBook;


    public Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom() {
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore() {
        Double average = 0.0;
        for (int i = 0; i < students.length; i++) {
            average += students[i].getAverageExamScore();
        }
       return average/students.length;
    }

    public void addStudent(Student student) {
        Arrays.fill(students, student);
    }

    public void removeStudent(String firstName, String lastName) {

        for (int i = 0; i<students.length; i++) {
            if (students[i].firstName.equals(firstName) && students[i].lastName.equals(lastName)){

            }
        }

    }

    public Student[] getStudentsByScore() {
        return null;
    }

    public String getGradeBook(){
        return  null;
    }
}
