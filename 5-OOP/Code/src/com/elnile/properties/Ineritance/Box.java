package com.elnile.properties.Ineritance;

public class Box {
    double l;
    double w;
    double h;
    double weight;



    Box () {
        l = -1;
        w = -1;
        h = -1;
    }

    // cube
    Box (double side) {
//        super();  // object class
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box (Box old) {
        this.h = old.h;
        this.w = old.w;
        this.h = old.h;
    }

    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
}
