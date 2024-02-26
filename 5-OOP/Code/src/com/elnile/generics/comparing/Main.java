package com.elnile.generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student ahmed = new Student(12, 88.0f);
        Student elniel = new Student(11, 92.7f);
        Student Ali = new Student(11, 96.7f);
        Student Omar = new Student(121, 76.7f);
        Student Hassan = new Student(141, 97.7f);

        Student[] students = {ahmed, elniel, Ali, Omar, Hassan};
        System.out.println(Arrays.toString(students));

        Arrays.sort(students);

        if (ahmed.compareTo(elniel) < 0) {
            System.out.println(ahmed.compareTo(elniel));
            System.out.println("Eniel has more marks");
        }
    }
}
