package com.cskaoyan._06oop2._02extends._08init;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 17:10
 **/
/*
类加载时机:
1.new 对象 (首次)
2.执行main
3.访问类中的静态成员(首次)
4.加载子类的时候会先触发父类的加载
 */
public class Demo {
    public static void main(String[] args) {
        // 通过创建Son对象来触发Son类的加载
        // Son son = new Son();
        // Father 类加载
        // Son 类加载
        // ====子类加载的时候先进行父类的加载


        GrandSon grandSon = new GrandSon();
    }
}

class GrandFather{
    static {
        System.out.println("GrandFather 类加载");
    }
}

class Father extends GrandFather{
    static {
        System.out.println("Father 类加载");
    }
}

class Son extends Father{
    static {
        System.out.println("Son 类加载");
    }
}

class GrandSon extends Son{
    static {
        System.out.println("GrandSon 加载");
    }
}