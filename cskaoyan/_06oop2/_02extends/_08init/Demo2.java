package com.cskaoyan._06oop2._02extends._08init;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 17:14
 **/
/*
1. 创建一个Person类，有name属性和eat方法
2. 创建一个Star类，有stageName属性和sing方法
3. Star类要继承Person类
4. 创建Star类对象，画出这个过程的内存图，描述子类对象初始化的过程
 */
public class Demo2 {
    public static void main(String[] args) {
        Star star = new Star();
    }
}

class Person{
    static {
        System.out.println("Person 静态代码块");
    }

    String name = "zs";
    {
        // 构造代码块
        name = "Jay";
    }

    public Person() {
        System.out.println("Person 构造器");
    }


    public void eat() {
        System.out.println("eat----");
    }
}

class Star extends Person{
    static {
        System.out.println("Start 静态代码块");
    }
    {
        stageName = "体育场";
    }
    String stageName = "体育馆";


    public void sing() {
        System.out.println("sing-----");
    }

    public Star() {
        // 显式初始化
        // super();
        // 没有super隐式初始化
        System.out.println("Star 构造器");
    }


}