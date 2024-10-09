package com.cskaoyan._06oop2._01encasulation._02ex;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 14:26
 **/

public class Person {
    private boolean isMale;

    private boolean gender;

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    // boolean类型的成员isMale()
    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}
