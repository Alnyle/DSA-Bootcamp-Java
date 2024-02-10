package com.Elnile.Introducation;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];


        // new: dynamically allocate memory and return reference variable to it

        // just declaring
//        Student Ahmed;
        // Ahmed: reference variable reference to object allocate in heap

        Student Ahmed = new Student(20,"Ahmed Elniel", 90f);
//        Ahmed.rno = 20;
//        Ahmed.name = "Ahmed Elniel";
//        Ahmed.marks = 90f;





        System.out.println(Ahmed.name);
        System.out.println(Ahmed.rno);
        System.out.println(Ahmed.marks);
        Ahmed.changeName("Ali Omar");

        Ahmed.greeting();

        //
        Student newStudent = new Student(Ahmed);
        System.out.println(newStudent.name);
        System.out.println(newStudent.rno);
        System.out.println(newStudent.marks);


        Student newStudent2 = new Student();
        System.out.println(newStudent2.name);

        System.out.println(Arrays.toString(students));


        Student one = new Student();
        System.out.println(one.name);
        Student two = one;
        two.name = "The name changed";
        System.out.println(one.name);



    }
}

class Student {
    /* Constructor: special type of function that run when you create an object and allocate
        some variable


       we need a way to add the value of the above properties object by object!
       we need one word to access every object!
      this: (current object) object name will replace with this keyword



     */
    int rno;
    String name;
    float marks;

    // default constructor
//    Student()  {
//        this.rno = 14; // like Ahmed.rno = rno;
//        this.name = "Ahmed Elniel";
//        this.marks = 56f;
//    }

    // Constructor overloading
    Student(int rno, String name, float marks) {
        this.rno = rno; // like Ahmed.rno = rno;
        this.name = name;
        this.marks = marks;
    }


    Student(Student other) {
        this.name = other.name;
        this.marks = other.marks;
        this.rno = other.rno;
    }

    // call Constructor in another constructor
    Student() {
        // how to call constructor from another constructor
        this (15, "Default name", 88.0f);
    }



    void greeting() {
        System.out.println("Hello " + this.name);
    }

    void changeName(String newName) {
        this.name = newName;
    }




}