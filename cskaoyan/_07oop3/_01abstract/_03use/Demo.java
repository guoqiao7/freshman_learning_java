package com.cskaoyan._07oop3._01abstract._03use;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/8 14:38
 **/
/*
抽象类的子类可以有两种情况：
1. 子类是普通类，普通类继承抽象类，必须实现所有的抽象方法。
2. 子类是抽象类，抽象子类不需要实现抽象方法，抽象子类可以自由选择实现（或实现或不实现）。
注：抽象类还可以继承一个普通类, 实际上如果一个抽象类, 它没有直接父类,
那它就直接继承Object

注意:
1. abstract关键字，不能用来修饰构造器、属性、代码块等结构。只能修饰类或者方法。
2. abstract修饰类时，类的修饰符不能有final。
3. abstract修饰方法时，该方法不能有修饰符：
   1. private
   2. static
   3. final
4. 一个抽象类中可以没有抽象方法，但是没有意义
 */
public class Demo {
    public static void main(String[] args) {

    }
}

abstract class AbstractA{
    public abstract void m1();
    public abstract int m2();

}

// 子类是具体类
//Class 'A' must either be declared abstract or
// implement abstract method 'm1()' in 'AbstractA'
class A extends AbstractA{

    @Override
    public void m1() {

    }

    @Override
    public int m2() {
        return 0;
    }
}

// 子类可以是抽象类  可以选择性的实现抽象方法
abstract class AbstractB{
    public abstract void m1();
    public abstract int m2();

}

abstract class B extends AbstractB{
    @Override
    public void m1() {

    }
}

// 普通类
class C{

}

// 抽象类继承普通类
abstract class AbsractC extends C{

}

abstract class D{
    //Modifier 'abstract' not allowed her
    // abstract int a = 1;;
    //abstract static {
    //
    //}

    //abstract public D() {
    //}

    // Illegal combination of modifiers: 'abstract' and 'private'
    // private abstract void m1();
    // static abstract void m1();
    // final abstract void m1();

}