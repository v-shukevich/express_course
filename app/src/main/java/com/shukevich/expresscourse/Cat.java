package com.shukevich.expresscourse;

public class Cat {
    private String mName;
    private int mAge;
    static int sId = 0;
    static int sTestNumber = 8;

    public Cat(String name, int age) {
        mName = name;
        mAge = age;
        sId++;
    }

    @Override
    public String toString() {
        return this.mName;
    }
}
