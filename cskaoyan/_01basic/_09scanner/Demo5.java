package com.cskaoyan._01basic._09scanner;

import java.util.Scanner;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 8:43
 **/
/*
当你使用Scanner类的nextInt()方法后再调用nextLine()方法时，
可能会遇到nextLine()方法直接返回而不等待输入的问题。
这是因为nextInt()读取整数值后，它不会读取行尾的换行符 \n。
当后续的nextLine()执行时，它读取到这个换行符，认为是一行的结束
，因此会立即返回，而不是等待输入新的数据。

在这个情况下，nextInt()读取了整数后，光标移至下一行，但换行符 \n 还在输入缓冲区中。调用nextLine()时，它会读取并返回换行符之前的所有字符，即空字符串，因为换行符之前没有其他字符。
 */
public class Demo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(i);
        String s = scanner.nextLine();
        System.out.println("s = "+s);
        System.out.println(s.equals(""));
    }
}
