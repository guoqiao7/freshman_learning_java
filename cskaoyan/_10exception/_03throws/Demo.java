package com.cskaoyan._10exception._03throws;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/11 10:35
 **/
/*
throws
在方法定义时使用
声明该方法可能抛出的异常
对于编译时异常，可以在语法层面强制方法调用者处理该异常
修饰符  返回值 方法名(形参列表)  throws 异常列表 {}
 */
public class Demo implements Cloneable{
    public static void main(String[] args) {
        try {
            // func1();
            // func2();
            func3();
        } catch (CloneNotSupportedException e) {
            // do sth
            System.out.println("需要实现Cloneable接口");
        }
    }

    // throws + 运行时异常--->没有太大的意义
    public static void func1() throws NullPointerException,ArithmeticException,RuntimeException {
        System.out.println(1111);
        System.out.println(10 / 0);
    }

    public static void func2(){
        System.out.println(1111);
        System.out.println(10 / 0);
    }

    // throws+编译时异常
    // 表示这个异常不在方法里处理  交给方法的调用者处理
    public static void func3() throws CloneNotSupportedException {
        Demo demo = new Demo();
        demo.clone();
    }
}

class  Father{
    // 子类方法不能比父类抛出更多的 编译时 异常
    public void m1() throws CloneNotSupportedException {

    }

    public void m2() throws Exception{

    }

    public void m3() throws NullPointerException{

    }
}

class Son extends Father{
    @Override
    public void m1() throws CloneNotSupportedException {

    }

    //@Override
    //public void m1() throws Exception {
    //
    //}


    @Override
    public void m2() throws CloneNotSupportedException {

    }

    @Override
    public void m3() throws ArithmeticException {

    }
}