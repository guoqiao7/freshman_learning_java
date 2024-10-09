package com.cskaoyan._06oop2._02extends._10hidden._02basic;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/6 10:14
 **/
/*
对象名.成员变量访问机制
1. 访问范围(编译的角度, .出来什么?)，究竟能够访问到哪些成员变量？根据什么来决定？
2. 访问结果(运行的角度)，如果是父子类同名成员变量，那么结果是什么？根据什么来决定？

创建对象的方式
1. 创建父类对象,用父类引用接收，用对象名点访问。
        范围: 父类
        结果: 父类的结果
2. 创建子类对象,用子类引用接收，用对象名点访问。
        范围: 父类 + 子类
        结果: 子类的结果
3. 创建子类对象,用父类引用接收，用对象名点访问。
        范围: 父类
        结果: 父类的结果

结论:
    1.访问范围: 取决于引用的类型  (编译看左边)
    2.访问结果: 取决于引用的类型  (运行也看左边)
 */
public class Demo {
    public static void main(String[] args) {
        // 1. 创建父类对象,用父类引用接收，用对象名点访问。
        Father father = new Father();
        System.out.println(father.fatherNum);
        System.out.println(father.num); // 1
        System.out.println("------");

        //2. 创建子类对象,用子类引用接收，用对象名点访问。
        Son son = new Son();
        System.out.println(son.fatherNum);
        System.out.println(son.sonNum);
        System.out.println(son.num); // 10
        System.out.println("------");

        //3. 创建子类对象,用父类引用接收，用对象名点访问。
        Father fs = new Son();
        System.out.println(fs.fatherNum);
        System.out.println(fs.num); // 1

    }
}

class Father{
    int num = 1;
    int fatherNum = 2;
}

class Son extends Father{
    int num = 10;
    int sonNum = 3;
}