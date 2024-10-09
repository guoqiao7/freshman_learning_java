package com.cskaoyan._01basic._09scanner;

import java.util.Scanner;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 16:16
 **/

/*
在有混合输入的情况下, 统一使用nextLine接收字符串数据
再把字符串数据转化为其他类型的数据

nextLine---->String
String---->int
String--->double

 */
public class Demo2 {
    public static void main(String[] args) {
        // Scanner对象
        Scanner scanner = new Scanner(System.in);
        // 使用nextLine方法接收字符串数据
        String s = scanner.nextLine();

        // "111" --->111
        // String---->int
        // Integer.parseInt(s)
        // int i = Integer.parseInt(s);

        // "3.14"--->3.14
        // String--->double
        double v = Double.parseDouble(s);
        System.out.println(s);

    }
}
