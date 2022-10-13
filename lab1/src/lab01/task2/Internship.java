package lab01.task2;

import java.util.List;
import java.util.Random;

public class Internship {
    private String name;
    private double minGrade;
    private List<Student> students;

    public Internship(String name, double minGrade, List<Student> students) {
        this.name = name;
        this.minGrade = minGrade;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public double getMinGrade() {
        return minGrade;
    }

    public List<Student> getStudents() {
        return students;
    }

    Student chooseCandidateRandomly() {
        Random rand = new Random();
        return this.students.get(rand.nextInt(students.size()));
    }

    void chooseCandidatesForInterview() {
        for (Student student : this.students) {
            if (student.getGrade() >= this.minGrade) {
                System.out.println("Candidate " + student.getName() + " got a phone interview at "+ this.name);
            }
        }
        System.out.println();
    }
}
