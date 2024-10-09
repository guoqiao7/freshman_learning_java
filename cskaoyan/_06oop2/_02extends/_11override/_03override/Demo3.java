package com.cskaoyan._06oop2._02extends._11override._03override;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/6 11:02
 **/

public class Demo3 {
    public static void main(String[] args) {
        Son3 s = new Son3();
        //Son3 s2 = new Son3(300);
        //Father3 fs = new Son3();
        //Father3 f = new Father3();
    }
}

class Father3 {
    int num = 100;

    public int getNum() {
        return num;
    }

    public Father3() {
        // 该行在执行时,如果创建的是子类对象,
        // 那么子类的任何赋值手段都没有执行,那子类中的num一定是0
        System.out.println(getNum());
    }

}

class Son3 extends Father3 {
    int num = 200;

    @Override
    public int getNum() {
        return num;
    }

    public Son3() {
        super();
    }

    public Son3(int num) {
        this.num = num;
    }
}
