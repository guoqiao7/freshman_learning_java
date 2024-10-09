package com.cskaoyan._05oop1._07constructor._02basic;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/3 9:16
 **/
/*
1. 一个类中，是允许同时定义多个构造方法的，即构造方法重载，多个构造器的形参必须不同。
   - 比如: 我们可以给Teacher类定义一个构造器, 用来创建对象的时候, 只指定课程, 不指定年龄
2. 构造方法的名字必须和类名一模一样
3. 构造器没有返回值
4. 构造器是完成对象的初始化(给对象赋值), 并不是创建对象,
创建对象时, 系统根据实参列表自动调用该类的构造器
5. 类中默认提供的无参构造方法，是在该类没有任何构造器的情况下才有的。
但是如果类中有任一构造器（有参/无参），那么就没有默认无参存在了
6. 在构造器中也会隐含this传参, 我们可利用this对成员变量进行赋值, 也可以使用快捷键, alt + insert快速生成构造器.
7. 构造器中还可以用this表示调用其它构造器，语法：
  this(实参列表);---->表示调用本类的其他构造器,通过实参列表来区分不同的构造器
   注意，在构造器中使用this(实参)表示调用类中其他构造器时，
   这行代码一定要处在构造器代码的第一行！
 */
public class Demo {
    public static void main(String[] args) {

    }
}

class Dog{
    String name;
    int age;
    // 构造器名字必须跟类名一样
    //public dog() {
    //
    //}


    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        // 调用其他构造器
        // System.out.println(1111);
        // Call to 'this()' must be first statement in constructor body
        this();
        // this("zs");
        this.name = name;
        this.age = age;
    }

    public Dog() {
    }
}