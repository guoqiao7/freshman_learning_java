package com.cskaoyan._01basic._11select;

import java.util.Scanner;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 17:03
 **/
/*
适用离散的数据 -->月份 星期
switch(expression){
case value1:
statement1;
break;
case value2:
statement2;
break;
...
default:
statement;
break;
}
 */
public class Demo2 {
    public static void main(String[] args) {
        // 根据用户输入的月份来判断季节
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字月份:");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("冬天");
                break;
            case 2:
                System.out.println("春天");
                break;
            case 6:
                System.out.println("夏天");
                break;
            default:
                System.out.println("输入不合法");
                break;
        }
    }
}
