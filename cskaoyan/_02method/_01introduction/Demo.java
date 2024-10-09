package com.cskaoyan._02method._01introduction;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 9:12
 **/
/*
引例，现在有三个需求：
1. 编写程序，计算10+20，并输出结果
2. 编写程序，计算111+222，并输出结果
3. 编写程序，计算333+444，并输出结果
---> 代码复用
 */
public class Demo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + b);

        int a2 = 111;
        int b2 = 222;
        System.out.println(a2 + b2);

        int a3 = 333;
        int b3 = 444;
        System.out.println(a3 + b3);
    }
}
