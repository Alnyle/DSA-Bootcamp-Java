package com.elnile.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student ahmed = new Student(12, 88.0f);
        Student elniel = new Student(11, 92.7f);
        Student Ali = new Student(11, 96.7f);
        Student Omar = new Student(121, 76.7f);
        Student Hassan = new Student(141, 97.7f);

        Student[] students = {ahmed, elniel, Ali, Omar, Hassan};
        System.out.println(Arrays.toString(students));

        // sort object using lambda function
//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return -(int)(o1.marks - o2.marks);
//            }
//        });

        // sort student based on their marks
        // using lambda arrow function
        Arrays.sort(students, (o1, o2) -> (int)(o1.marks - o2.marks));
        System.out.println(Arrays.toString(students));

        if (ahmed.compareTo(elniel) < 0) {
            System.out.println(ahmed.compareTo(elniel));
            System.out.println("Eniel has more marks");
        }
    }
}
