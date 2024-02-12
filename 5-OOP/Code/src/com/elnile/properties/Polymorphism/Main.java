package com.elnile.properties.Polymorphism;

public class Main {
    public static void main(String[] args) {

        // poly: many
        // morphism: way to represent entity
        // you can inherit static function but can not override


        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        shape.area();
        circle.area();
        square.area();
        triangle.area();

    }
}
