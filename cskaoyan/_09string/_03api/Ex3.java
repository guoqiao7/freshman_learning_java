package com.cskaoyan._09string._03api;

import java.util.Scanner;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/9 17:09
 **/
/*
课堂练习：
	1:字符串反转
	2:举例:
	键盘输入abc,反转后结果为cba
 */
public class Ex3 {
    public static void main(String[] args) {
        // 键盘接收数据
        System.out.println("输入一个字符串");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        // method1(s);

        // String--->char[]
        char[] chars = s.toCharArray();
        // 倒着遍历数组
        String str = "";
        for (int i = chars.length-1; i >= 0; i--) {
            str += chars[i];
        }
        System.out.println("str = " + str);
    }

    private static void method1(String s) {
        // 倒着遍历字符串
        // 定义空字符串用于拼接
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            // 重新拼接
            str += s.charAt(i);
        }
        // 循环结束 输出结果
        System.out.println("str = " + str);
    }
}
