package io.zipcoder;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores;

    Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>();
        this.examScores.addAll(List.of(examScores));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfExamsTaken() {
        return examScores.size();
    }

    public String getExamScores(){
        String listOfExamScores = "Exam Scores: \n";
        for (int i = 0; i < examScores.size(); i++) {
            listOfExamScores = listOfExamScores +
                    "\t Exam " + (i+1) +" -> " + (examScores.get(i).intValue()) + "\n";
        }
        return listOfExamScores;
    }

    public void addExamScore(double examScore) {
        examScores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore) {
        examScores.set(examNumber-1, newScore);
    }

    public Double getAverageExamScore() {
        Double average = 0.0;
        for (int i = 0; i < examScores.size(); i++) {
            average += examScores.get(i);
        }
        return  average/examScores.size();
    }

    @Override
    public String toString() {
        return "Student Name: " + firstName + " " + lastName + "\n" +
                "> Average Score: " + getAverageExamScore().intValue() + "\n" +
                "> " + getExamScores();
    }
}
