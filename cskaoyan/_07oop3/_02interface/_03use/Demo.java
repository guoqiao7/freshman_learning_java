package com.cskaoyan._07oop3._02interface._03use;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/8 16:05
 **/
/*
接口的使用:
1. 普通类实现接口，必须实现所有的抽象方法。
2. 抽象类实现接口，按需实现抽象方法。
3. 接口可以继承一个接口，并且接口在继承接口后，
可以重写父接口中的抽象方法和默认方法。
 */
public class Demo {
    public static void main(String[] args) {

    }
}
interface IA{
    void m1();
    void m2();
}
// 子类是普通类 必须实现接口中的所有的抽象方法
class IAImpl implements IA{

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }
}

// 子类是抽象类 选择性实现抽象方法
abstract class AbstractA implements IA{
    @Override
    public void m1() {

    }
}

// 子类是接口 选择性实现抽象方法
interface IB extends IA{

}

// 接口是多继承的
interface IC{

}
interface ID{

}
interface IE{

}

interface IF extends IC, ID, IE {


}