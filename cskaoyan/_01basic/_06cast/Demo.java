package com.cskaoyan._01basic._06cast;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 10:58
 **/
/*
数据类型的转换又可以分为两类：
1. 自动类型转换
    自动完成的 不需要写额外的代码
    小范围--->大范围
2. 强制类型转换
    需求修改代码实现 需要额外的操作
    大范围--->小范围
 */
public class Demo {
    public static void main(String[] args) {
        // 自动类型准换  小范围--->大范围
        // byte--->int
        byte a = 1;
        int a1 = a;

        // 强制类型转换 需要改代码
        int b = 1;
        // 目标数据类型 变量名 = (目标数据类型)(被转换变量的变量名);
        // byte b1 = b;
        byte b2 = ((byte) b);

    }
}
