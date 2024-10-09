package com.cskaoyan._01basic._09scanner;

import java.util.Scanner;
/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 16:04
 **/

/*
Scanner使用
1.导包
2.创建Scanner对象
3.使用Scanner对象中的方法
 */
public class Demo {
    public static void main(String[] args) {
        // 2.创建Scanner对象
        // new 关键字表示在堆上开辟空间 创建对象
        // 标准输入流 System.in 默认键盘输入
        Scanner scanner = new Scanner(System.in);
        // nextInt()是一个阻塞方法
        System.out.println("next before");
        // 接收整数
        // int i = scanner.nextInt();
        // 接收小数
        //double v = scanner.nextDouble();
        //System.out.println("next after");
        // System.out.println("i = " + i);
        // System.out.println("v = " + v);

        // 接收字符串 nextLine()
        String s = scanner.nextLine();
        System.out.println("s = " + s);
    }
}
