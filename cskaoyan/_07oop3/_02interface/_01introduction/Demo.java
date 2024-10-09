package com.cskaoyan._07oop3._02interface._01introduction;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/8 15:31
 **/

public class Demo {
}

abstract class Animal {
    public abstract void shout();
}
class Cat extends Animal {
    @Override
    public void shout() {
        System.out.println("猫叫");
    }
}
class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("狗叫");
    }
}

class SuperCat extends Cat implements Skill2{
    public void walk() {
        System.out.println("直立行走");
    }
}

// Java中是单继承的
//class SuperDog extends Dog,Skill{
//    public void walk() {
//        System.out.println("直立行走");
//    }
//}

abstract class Skill{
    public abstract void walk();
}

/*
[访问权限修饰符] interface 接口名{

}
 */
interface Skill2{
    // 定义一个抽象的方法
    public abstract void walk();
}