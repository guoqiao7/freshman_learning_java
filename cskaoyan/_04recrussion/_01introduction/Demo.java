package com.cskaoyan._04recrussion._01introduction;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/2 9:18
 **/

public class Demo {
    public static void main(String[] args) {
        m1();
    }

    public static void m1() {
        // do sth
        // 调用自己本身
        // java.lang.StackOverflowError 栈溢出
        // XxxxError--->错误

        // NullPointerException
        // ArrayIndexOutOfBoundsException
        // xxxxException--->异常
        m1();
    }
}
