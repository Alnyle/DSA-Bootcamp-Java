package com.elniel_2.enumExample;

public class Basic {

    enum Week implements A {
       Monday, Tuesday, wednesday, thursday, Saturday, Sunday;
       // these enum constants
        // every variable public static final
        // since it's final you can not create child enums
        // type is Week

        // abstract function is not allowed in enum: function without a body
        void display() {}

        Week() {
            System.out.println("Constructor called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("Hey how are you?");
        }

        // Why this not public or protected, only private or default
        // why? we don't want to create new Objects
        // this not enum concept, that's why

        // internally: public static final Week Monday = new Week()
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        System.out.println(Week.valueOf("Monday"));

//        for (Week day : week.values()) {
//            System.out.println(day);
//        }

        week.hello();

        // ordinal: index of current object
//        System.out.println(week.ordinal());
    }
}
