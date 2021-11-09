package com.shukevich.expresscourse;

public class Cat extends Animal implements SimpleInterface {

    @Override
    String sleep() {
        //return super.sleep();
        return "Коты постоянно спят!";
    }

    @Override
    public String getClassName() {
        return "Cat";
    }

    @Override
    public int getAge() {
        return 5;
    }
}