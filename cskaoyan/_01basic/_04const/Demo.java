package com.cskaoyan._01basic._04const;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 10:17
 **/
/*
常量:
    1.字面值常量
        直接写在程序中的常量
        整数  1, 2, 3, 4
        小数  1.2 3.4
        字符  'a' '你'
        字符串常量  "abc" "你好"
        布尔常量 true/false
        空常量 null 引用数据类型的特殊取值
    2.自定义常量
        用final修饰的变量-->自定义常量
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(1.1);
        System.out.println('a');
        System.out.println(true);
        // 自定义常量
        final int a = 1;
        System.out.println(a);
        // Cannot assign a value to final variable 'a
        // a = a+1;

    }
}
