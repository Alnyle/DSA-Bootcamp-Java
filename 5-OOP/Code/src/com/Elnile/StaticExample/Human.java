package com.Elnile.StaticExample;



public class Human {
    int age; // instance variable: only relate to one object or belong to object
    String name;
    int salary;
    boolean married;

    /* static variable: not relate to one object but common
           to all object to this class to

           to access it use class name
      */
    static long population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population++;
        /*
           if you " this.population " it's correct way to do it but it will why?
           because it will the object population variable is exist in that object!
           no it will to class it's self
         */
    }
}
