package Elniel.com;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // syntax
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(12);
//        list.add(3);
//        list.add(152);
//        list.add(2);
//        list.add(112);
//        list.add(312);
//        list.add(321);
//        list.add(1312);
//        list.add(142);
//        list.add(5);

//        list.removeFirst();
//        list.set(0, 1000);
//        System.out.println(list.contains(1000));
//        list.remove(1);
//        System.out.println(list); // internally call toString

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }




        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }


    }
}
