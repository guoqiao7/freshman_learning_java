package com.cskaoyan._05oop1._13access._01introduction;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/4 10:53
 **/

/*
Java的访问权限级别共分为以下四个级别，访问权限从严格到宽松顺序为：
1. private: 只能够在同一类中能够访问，私有的，外面谁都不能用。
2. 缺省(默认): 同一包中的子类或者其它类能够访问，同包中都可以使用。
3. protected: 不同包的子类能够访问。(这个访问级别继承再学习)
4. public: 不同包的其他类能够访问。

class有2个权限,要么是public的 要么是不填 (不包含内部类)
 */
public class Demo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
    }
}

class A{}

//Modifier 'private' not allowed here
// private class B{}