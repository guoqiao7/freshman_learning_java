package com.cskaoyan._10exception._05finally;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/11 14:40
 **/
/*
try代码块如果有return
 */
public class Demo2 {
    public static void main(String[] args) {
        try {
            System.out.println(111);
            // return
            return;
        } catch (ArithmeticException e) {
            System.out.println("算术异常");
        } finally{
            System.out.println("finally");
        }
        System.out.println("2222");
    }
}
