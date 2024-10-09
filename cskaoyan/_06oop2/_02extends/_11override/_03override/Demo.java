package com.cskaoyan._06oop2._02extends._11override._03override;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/6 10:42
 **/
/*
`@Override`，就和它的名字一样，这个注解写在子类的方法头上，
用于检测子类中的某个方法，是否是父类方法的重写
 */
public class Demo {

}
class Father{
    public void m1() {
        System.out.println(111);
    }

    public void m3() {

    }

    public void m4() {

    }

    // 定义一个静态的方法
    public static void m5() {

    }
}

class Son extends Father{
    @Override
    public void m1() {
        System.out.println(222);
    }

    //Method does not override method from its superclass
    //@Override
    //public void m2() {
    //
    //}

    // 直接输出方法名 回车
    @Override
    public void m3() {
        // do sth
    }
    // 使用快捷键 alt+insert---> override method

    @Override
    public void m4() {
        super.m4();
    }

    // Static methods cannot be annotated with @Overrid
    //@Override
    //public static void m5() {
    //
    //}
}