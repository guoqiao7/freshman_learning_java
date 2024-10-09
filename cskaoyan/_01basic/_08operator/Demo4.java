package com.cskaoyan._01basic._08operator;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 15:08
 **/
/*
赋值运算符: =
变形 += /= ....
 */
public class Demo4 {
    public static void main(String[] args) {
        int a = 1;
        a += 1;
        // 等价于
        a = a+1;

        // 正常情况下short + 1结果是int类型
        // 隐含了一个强制类型转换
        short s1 = 1;
        s1 += 1;
    }
}
