package com.elnile.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();

        // determine what function to run during runtime
        // function of interface should not have implementation
        // member have to static and final
        // can create object of interface
        // important: don't use interfaces to performing (critical) important code because it's resolve during runtime

//        car.acc();
//        car.stop();
//        car.start();
//        car.brake();


        Media mediaCar = new Car();
        mediaCar.stop();

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();

    }
}
