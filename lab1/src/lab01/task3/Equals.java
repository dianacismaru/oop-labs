package lab01.task3;

import lab01.task2.Student;

public class Equals {
    public static void main(String[] args) {
        Student firstStudent = new Student("Diana", 8.75);
        Student secondStudent = new Student("Diana", 8.75);
        /* Student secondStudent = firstStudent; */

        if (firstStudent.equals(secondStudent)) {
            System.out.println("The references refer to the same object, so they are equal.");
        } else {
            System.out.println("Although the objects contain the same data, they are not equal.");
        }
    }
}
