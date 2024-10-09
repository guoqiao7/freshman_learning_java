package com.cskaoyan._07oop3._01abstract._01introduction;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/8 14:17
 **/

public class Demo {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.shout();
        animal = new Cat();
        animal.shout();

        // 抽象类不能创建对象 不能被实例化
        // Animal' is abstract; cannot be instantiated
        // Animal animal1 = new Animal();
    }
}
// 被abstract修饰的类--->抽象类
abstract class Animal {
    //Missing method body, or declare abstract
    // 使用abstract修饰一个方法--->抽象方法
    // 抽象方法没有方法体

    // Abstract method in non-abstract class
    // 抽象方法必须定义子抽象类中
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