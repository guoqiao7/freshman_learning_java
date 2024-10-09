package com.cskaoyan._03array._05exception;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 17:04
 **/

/*
异常信息
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.cskaoyan._03array._05exception.Demo.main(Demo.java:13)
1.异常信息的线程名称thread-->main
2.java.lang.ArithmeticException --->异常的类型(全限定类名)
3.原因-->/ by zero
4.具体位置-->哪个类哪个方法哪一行代码出错
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("main start");

        System.out.println(10/0);

        System.out.println("main end");
    }
}
