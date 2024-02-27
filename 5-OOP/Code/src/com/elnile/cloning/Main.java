package com.elnile.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Ahmed = new Human(21, "Ahmed");
//        Human Elniel = new Human(Ahmed);
        Human Elniel = (Human)Ahmed.clone();

        System.out.println(Elniel.age + " " + Elniel.name);
        System.out.println(Arrays.toString(Elniel.arr));

        Elniel.arr[0] = 100;
        System.out.println(Arrays.toString(Elniel.arr));
    }
}
