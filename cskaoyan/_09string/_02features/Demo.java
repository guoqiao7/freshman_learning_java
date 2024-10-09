package com.cskaoyan._09string._02features;

import java.util.Scanner;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/9 14:56
 **/

/*
请键盘录入一个任意字符串s，并用一个temp字符串引用也指向它
这个时候修改temp字符串的内容，请问s字符串的内容会随之改变吗？
 */
public class Demo {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        // 键盘接收一个字符串
        String s = scanner.nextLine();
        // temp字符串引用也指向它
        String temp = s;
        // 更改temp内容
        temp = "aaa";
        // 打印temp
        System.out.println(temp);
        // 打印s
        System.out.println(s);
    }
}
