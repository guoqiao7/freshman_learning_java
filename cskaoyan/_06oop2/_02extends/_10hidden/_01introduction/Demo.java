package com.cskaoyan._06oop2._02extends._10hidden._01introduction;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/6 10:10
 **/

public class Demo {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.a); // 10 子类的结果
        int num = son.test();
        System.out.println(num);
    }
}

class  Father{
    int a = 1;

    public int getA() {
        return a;
    }

    public int test() {
        return getA();
    }
}
class Son extends Father{
    int a = 10;
}