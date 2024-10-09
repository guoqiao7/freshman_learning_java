package com.cskaoyan._01basic._07expression;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 14:34
 **/

public class Demo3 {
    public static void main(String[] args) {
        // 整数常量的特殊性
        byte b = 1 + 2;

        int a = 1;
        byte b2 = (byte) (a + 2);

        // 超出了byte的取值范围
        // byte b3 = 126+2;
    }
}
