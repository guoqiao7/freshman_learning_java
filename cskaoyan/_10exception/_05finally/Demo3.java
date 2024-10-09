package com.cskaoyan._10exception._05finally;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/11 14:40
 **/
/*
catch代码块中如果有return，并且catch正常捕获异常执行
 */
public class Demo3 {
    public static void main(String[] args) {
        try {
            System.out.println(111);
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("算术异常");
            return;
        } finally{
            System.out.println("finally");
        }
        System.out.println("2222");
    }
}
