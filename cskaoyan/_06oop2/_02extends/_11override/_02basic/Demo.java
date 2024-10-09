package com.cskaoyan._06oop2._02extends._11override._02basic;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/6 10:31
 **/
/*

1. 访问范围，究竟能够访问到哪些成员方法？根据什么来决定？
2. 访问结果，如果是父子类同名成员方法，那么结果是什么？根据什么来决定？

1. 创建父类对象,用父类引用接收，用对象名点访问。
    范围: 父类
    结果:父类
2. 创建子类对象,用子类引用接收，用对象名点访问。
    范围: 父类+子类
    结果: 子类类
3. 创建子类对象,用父类引用接收，用对象名点访问。
    范围: 父类
    结果: 子类

结论:
    1.访问范围 : 取决于引用的类型 (编译看左边)
    2.访问结果 : 取决于对象的类型 (运行看右边)
 */
public class Demo {
    public static void main(String[] args) {
        //1. 创建父类对象,用父类引用接收，用对象名点访问。
        Father father = new Father();
        father.fatherMethod();
        father.func(); // father func
        System.out.println("----------");
        //2. 创建子类对象,用子类引用接收，用对象名点访问。
        Son son = new Son();
        son.fatherMethod();
        son.sonMethod();
        son.func(); // son func

        System.out.println("------");
        //3. 创建子类对象,用父类引用接收，用对象名点访问。
        Father fs = new Son();
        fs.fatherMethod();
        fs.func(); // son func

    }
}

class Father{
    public void func() {
        System.out.println("father func");
    }
    public void fatherMethod() {
        System.out.println("fatherMethod");
    }
}

class Son extends Father{
    public void func() {
        System.out.println("son func");
    }

    public void sonMethod() {
        System.out.println("sonMethod");
    }
}