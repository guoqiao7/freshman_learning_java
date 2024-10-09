package com.cskaoyan._01basic._15return;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 9:03
 **/

/*
return:
1.表示方法结束
2.配合方法来返回一个方法执行后的结果
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("main start");
        System.out.println("main end");
        //return;
        // System.out.println(1111);
        method1();
        method2();
        method3();
        // method4();
    }



    public static void method1() {
        // do sth
        return;
    }

    public static int method2() {
        // Missing return statement
        return 1;
    }

    public static String method3() {
        // Missing return statement
        return "1";
    }


    public int method4() {
        return 1;
    }
}
