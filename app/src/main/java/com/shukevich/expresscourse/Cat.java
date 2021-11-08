package com.shukevich.expresscourse;

public class Cat extends Animal {

    @Override
    String sleep() {
        //return super.sleep();
        return "Коты постоянно спят!";
    }
}