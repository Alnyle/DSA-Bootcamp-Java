package com.elnile.generics.comparing;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + "";
    }

    @Override
    public int compareTo(Student otherStudent) {
        System.out.println("Compare function is running");
        int diff = (int)(this.marks - otherStudent.marks);

        // if diff == 0: means both are equal
        // if diff < 0: means otherStudent is bigger else otherStudent is smaller
        return diff;
    }
}
