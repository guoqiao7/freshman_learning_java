package com.cskaoyan._06oop2._02extends._09super;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/6 9:10
 **/
/*
隐式初始化的条件
1. 父类中有默认的构造方法
2. 子类的构造器中没有显式使用super调用父类的构造方法，也没有用this去调用自己的构造方法。

达成上述两个条件，则JVM在初始化子类对象时进行隐式初始化，永远先执行父类的构造方法，顺序为：

1. 最上层的父类（Object）
2. 其他父类（继承链中越处于上流越先执行）
3. 所有父类的构造方法都执行完毕，开始执行子类构造方法
 */
public class Demo {
    public static void main(String[] args) {
        Son son = new Son();
    }
}

class Father{
    int a;

    public Father(int a) {
        this.a = a;
    }

    // 没有默认构造器了
    public Father() {
    }
}

class Son extends Father{
    int b;

    public Son(int b) {

        this.b = b;
    }

    // There is no default constructor available in 'com.cskaoyan._06oop2._02extends._09super.Father'
    public Son() {

        // this(10);
        // 隐藏的
        // super();
        // 显式的初始化
        super(10);

    }
}