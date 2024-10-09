package com.cskaoyan._01basic._08operator;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 14:40
 **/

/*
算数运算符

% 取余
++
--
a++   先取值 后+1
++a;  先+1  后取值
 */
public class Demo {
    public static void main(String[] args) {
        int a = 10;
        if (a % 2 == 0) {
            System.out.println("偶数");
        }
        a++;
        // 等价于
        a = a+1;
    }
}
