package com.cskaoyan._10exception._06define;

import java.util.Scanner;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/11 14:59
 **/
/*
考试成绩必须在0-100分之间，如果有考试成绩不在这个范围之内，则认为成绩异常。

对于以上的异常，Java语言中显然没有一个对应的“考试分数异常超出范围”的异常，因此该异常需要我们自己来定义
 */
public class Demo {
    public static void main(String[] args) {
        //try {
        //    func1();
        //} catch (MyException e) {
        //    // throw new RuntimeException(e);
        //    e.printStackTrace();
        //}

        func2();
    }

    // 编译时异常
    public static void func1() throws MyException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个分数:");
        int score = scanner.nextInt();
        // 判断分数是否合法
        if (score < 0 || score > 100) {
            // 不合法的 抛出一个异常
            // throw+编译时异常需要结合throws一起使用
            throw new MyException("分数不合法");
        }
    }

    public static void func2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个分数:");
        int score = scanner.nextInt();
        // 判断分数是否合法
        if (score < 0 || score > 100) {
            // 不合法的 抛出一个异常
            // throw+ 运行时异常对象
            throw new ScoreException("分数不合法,请重新输入");
        }
    }

}
// 定义编译时异常 继承Exception
class MyException extends Exception{
    // 提供构造器

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}

// 定义运行时异常 继承RuntimeException
class ScoreException extends RuntimeException{
    public ScoreException() {
    }

    public ScoreException(String message) {
        super(message);
    }
}