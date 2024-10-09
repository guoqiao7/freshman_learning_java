package com.cskaoyan._06oop2._02extends._07limit;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 16:59
 **/
/*
继承的限制:
1.父类中的构造器--->跟继承没关系
2.父类中的静态成员
3.父类中的私有成员--->继承了但是没权限访问
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(Father.a);

        // 可以通过子类类名.静态成员名 访问父类中的静态成员
        // 但是这里不是继承
        System.out.println(Son.a);

        Son son = new Son();
        // b' has private access
        // System.out.println(son.b);

        int b = son.getB();
        System.out.println(b);
    }
}

class Father{
    static int a = 1;

    private int b = 10;

    // 只有在本类中能访问
    public void m1() {
        System.out.println(b);
    }

    public int getB() {
        return b;
    }
}

class Son extends Father{

}