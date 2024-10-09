package com.cskaoyan._01basic._03datatype;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 9:26
 **/

/*
数据类型的分类:
1.基本数据类型
    4类
        整型
            byte   1B  0000 0000 - 1111 1111
            short  2B   16位
            int    4B   32位
            long   8B   64位
        浮点型
            float  单精度
            double 双精度
        字符型
            char 2B 16位 [0,65535]
            a ---> 97
            0 ---> 48

        布尔型
            boolean : true / false
2.引用数据类型
    除了基本数据类型外 其他类型全是引用数据类型
    String
    class
    interface
    枚举...
 */
public class Demo {
    public static void main(String[] args) {
        // int phone = 13611111111;
        String phone = "13611111111";
        // System.out.println(1 - 0.9);
        byte a = 1; // 0000 0001
        short a1 = 1; // 0000 0000 0000 0001
        long a2 = 1L;

        float b1 = 3.14F;
        // 小数默认是double
        double b2 = 1.28;

        // char
        char c = 'a';
        System.out.println(c+1);
        char c1 = '你';

        // boolean
        boolean d = true;
        boolean d2 = false;

    }
}
