package lab01.task2;

import java.util.ArrayList;
import java.util.List;

public class JobMarket {
    public static void main(String[] args) {
        Student gigel = new Student("Gigel", 10);
        Student marcel = new Student("Marcel", 9.7);
        Student dorel = new Student("Dorel", 9.9);
        Student ionel = new Student("Ionel", 9.2);
        List<Student> students = new ArrayList<>();
        students.add(gigel);
        students.add(marcel);
        students.add(dorel);
        students.add(ionel);

        Internship google = new Internship("Google", 9.9, students);
        google.chooseCandidatesForInterview();

        Internship amazon = new Internship("Amazon", 9.3, students);
        amazon.chooseCandidatesForInterview();

        Internship facebook = new Internship("Facebook", 9.8, students);
        facebook.chooseCandidatesForInterview();

        Internship microsoft = new Internship("Microsoft", 9.5, students);
        microsoft.chooseCandidatesForInterview();
    }
}
