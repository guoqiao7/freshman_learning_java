package com.cskaoyan._06oop2._03polymorphic._02basic;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/8 10:21
 **/
/*
多态的访问体征
父类引用指向子类对象

1.访问范围
    成员变量 --> 取决于引用的类型
    成员方法 --> 取决于引用的类型
2.访问结果
    成员变量---> 取决于引用的类型
    成员方法---> 取决于对象的类型

属性: 编译看左 运行看左
方法: 编译看左 运行看右
 */
public class Demo {
    public static void main(String[] args) {
        Father fs = new Son();
        // 属性的访问
        System.out.println(fs.fatherNum);
        System.out.println(fs.num);
        // fs.sonNum
        System.out.println("-----");
        // 方法的访问
        fs.onlyFather();
        fs.test();
        // fs.onlySon();

    }
}

class Father{
    int num = 1;
    int fatherNum = 2;

    public void test() {
        System.out.println("father test");
    }

    public void onlyFather() {
        System.out.println("onlyFather");
    }
}

class Son extends Father{
    int num = 10;
    int sonNum = 20;
    public void test() {
        System.out.println("son test");
    }

    public void onlySon() {
        System.out.println("onlySon");
    }
}