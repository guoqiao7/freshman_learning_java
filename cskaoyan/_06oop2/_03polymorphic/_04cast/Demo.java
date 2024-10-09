package com.cskaoyan._06oop2._03polymorphic._04cast;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/8 10:53
 **/
/*
instanceof关键字:
    引用名 instanceof 类名
        true: 表示该引用指向的对象，是后面类名的一个对象或者子类对象
        false:
 */
public class Demo {
    public static void main(String[] args) {
        GrandFather gf = new Son();
        // 引用数据类型转换的引用的类型
        Father father = (Father) gf;
        Son son = (Son) father;
        // java.lang.ClassCastException
        // GrandSon gs = (GrandSon) son;
        System.out.println(gf instanceof Father);// true
        System.out.println(gf instanceof Son);// true
        System.out.println(gf instanceof GrandSon);// false

    }
}

class GrandFather{

}

class Father extends GrandFather{

}

class Son extends Father{

}

class GrandSon extends Son{

}
