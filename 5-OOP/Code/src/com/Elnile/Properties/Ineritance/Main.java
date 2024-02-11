package com.Elnile.Properties.Ineritance;

public class Main {
    public static void main(String[] args) {

        BoxWeight box1 = new BoxWeight(2, 3, 5, 6);

        System.out.println(box1.h + " " + box1.l);

        // type of reference variable determine what members can access
        // not the type of object
        Box box2 = new BoxWeight(4, 12, 6, 24);
//        System.out.println(box2.weight); // error
        System.out.println(box2);

        BoxPrice box3 = new BoxPrice();

        BoxPrice box4 = new BoxPrice(4,16, 30);






    }
}
