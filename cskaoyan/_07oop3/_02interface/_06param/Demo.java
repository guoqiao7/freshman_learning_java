package com.cskaoyan._07oop3._02interface._06param;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/8 16:59
 **/

// 方法传参和返回值
public class Demo {
    public static void main(String[] args) {
        m1(new Father());
        // 自动类型转换
        m1(new Son());

        //'AbstractFather' is abstract; cannot be instantiated
        // m3(new AbstractFather());
        // 使用抽象类型的子类
        m3(new Son2());


        // 使用的是接口的实现类
        m5(new IAImpl());
    }

    public static void m1(Father father) {

    }

    public static Father m2() {
        // return new Father();
        return new Son();
    }


    public static void m3(AbstractFather father) {

    }

    public static AbstractFather m4() {
        // 使用子类型
        return new Son2();
    }


    public static void m5(IA ia) {

    }

    public static IA m6() {
        // 返回接口的子类对象
        return new IAImpl();
    }
}

class Father{
    public void m1() {

    }

    public int m2() {
        return 1;
    }


    public Animal m3() {
        return null;
    }

    public AbstractAnimal m4() {
        return null;
    }

    public IB m5() {
        return null;
    }
}
class Son extends Father{
    @Override
    public void m1() {

    }

    @Override
    public int m2() {
        return 1;
    }

    @Override
    public Dog m3() {
        return null;
    }

    @Override
    public Cat m4() {
        return null;
    }

    @Override
    public IBImpl m5() {
        return null;
    }
}

abstract class AbstractFather{

}

class Son2 extends AbstractFather{

}

interface IA{

}
class IAImpl implements IA{

}

class Animal{

}
class Dog extends Animal{}

abstract class AbstractAnimal{

}

class Cat extends AbstractAnimal{}

interface IB{

}
class IBImpl implements IB{}