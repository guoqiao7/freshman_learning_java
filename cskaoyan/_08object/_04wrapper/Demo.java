package com.cskaoyan._08object._04wrapper;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/9 10:07
 **/

/*
基本数据---包装类型
byte-----Byte
short----Short
int -----Integer
long-----Long
float----Float
double---Double
char-----Character
boolean--Boolean

装箱与拆箱
装箱 : 基本数据类型--->包装类型
拆箱: 包装类型---->基本数据类型
 */
public class Demo {
    public static void main(String[] args) {
        int a = 1;

        Integer i = 1; // 自动装箱
        System.out.println(a);
        System.out.println(i);
        Integer i1 = new Integer(1);
        System.out.println(i1);
        // 拆箱
        int b = i1.intValue();
        // String--->int
        // Integer.parseInt()
        // String--->Double
        // Double.parseDouble()

        char c = 'a';
        char c1 = Character.toUpperCase(c);
        System.out.println(c1);
    }

    // 假设前端传过来一个null
    public static void m1(int a) {
        // do sth
        // a = null;
    }

    public static void m2(Integer integer) {
        // do sth
        // integer = null;
        if (integer != null) {
            // do sth
        }
    }
}
