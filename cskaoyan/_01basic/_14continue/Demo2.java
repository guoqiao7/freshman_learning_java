package com.cskaoyan._01basic._14continue;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 8:59
 **/
/*
请在注释处补全代码，实现以下功能：

1. 控制台输出2次，"我热爱学习Java"
2. 控制台输出7次，"我热爱学习Java"
3. 控制台输出13次，"我热爱Java"
 */
public class Demo2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                //在此处填写代码
                // break;
                // continue;
                System.out.println("我热爱学习Java");
            }
            System.out.println("我热爱学习Java");
        }
    }
}
