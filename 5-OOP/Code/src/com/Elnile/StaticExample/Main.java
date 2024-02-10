package com.Elnile.StaticExample;

public class Main {
    public static void main(String[] args) {

        /*
         static function allow to you to use function or variable with
         create an object that class
         */

        Human Elniel = new Human(21, "Ahmedelniel Esmaiel", 100000, false);
        // to access static variable or function to use object name like this!
        System.out.println(Elniel.population);
        Human omar = new Human(43, "John Doe", 1200000, true);
        // use instead class name like this.
        System.out.println(Human.population);
    }
}
