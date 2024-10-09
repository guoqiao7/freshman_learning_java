package com.cskaoyan._10exception._01introduction;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/11 9:02
 **/
/*
异常体系分类:
    祖先类:Throwable
    Error: 比较严重的错误 虚拟机内部的错误 代码处理不了
        比如: java.lang.StackOverflowError 栈溢出
        java.lang.OutOfMemoryError: Java heap space 堆满了
    Exception:
        异常,不严重的错误,代码层面可以处理
        根据处理方式的不同:
        编译时异常: 编译不通过,一定要处理
        运行时异常: 编译通过,但是运行的时候会有问题


常见的异常:
    运行时异常:
        java.lang.ArithmeticException 算数异常
        java.lang.NullPointerException 空指针异常
        java.lang.ArrayIndexOutOfBoundsException 数组下标越界异常
        java.lang.ClassCastException 类型转换异常
        java.util.InputMismatchException 输入不匹配
    编译时异常
         java.lang.CloneNotSupportedException 不支持clone异常
         java.io.FileNotFoundException
         java.io.IOException
 */
public class Demo {
    public static void main(String[] args) {

        // func();
        //java.lang.StackOverflowError

        // int[] ints = new int[1024 * 1024 * 1024];
        //java.lang.OutOfMemoryError: Java heap space

        // System.out.println(10/0);
        //Demo demo = new Demo();
        //demo = null;
        //System.out.println(demo.toString());

        //String[] strs = {"a"};
        //System.out.println(strs[1]);
        // java.lang.ArrayIndexOutOfBoundsException

        //Father father = new Father();
        //Son son = (Son) father;
        // java.lang.ClassCastException

        //Scanner scanner = new Scanner(System.in);
        //int i = scanner.nextInt();
        //System.out.println(i);
        // java.util.InputMismatchException

        //Demo demo = new Demo();
        //demo.clone();
        //  java.lang.CloneNotSupportedException
        //File file = new File("D:\\cc.txt");
        //FileInputStream in = new FileInputStream(file);
        //  java.io.FileNotFoundException
        //  java.io.IOException
    }

    private static void func() {
        func();
    }
}

class Father{

}
class Son extends Father{

}