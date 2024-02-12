package com.elnile.properties.Ineritance;

public class BoxWeight extends Box {
    double weight;

    BoxWeight () {
        this.weight = -1;
    }

    // copy constructor
    BoxWeight (BoxWeight other) {
        super(other);
        this.weight = other.weight;
    }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h); // call parent class constructor
        //used to initialise value present in parent class
        this.weight = weight;

        // can use super to access parent class members
        System.out.println(super.weight);
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
}
