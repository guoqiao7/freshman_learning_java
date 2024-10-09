package com.cskaoyan._08object._04wrapper;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/10 10:44
 **/

public class InterviewTest {
    public static void main(String[] args) {
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i1 == i2);// false
        // 装箱过程用的是valueOf方法 里面有缓存 -128-127
        Integer i3 = 1;
        Integer i4 = 1;
        System.out.println(i3 == i4);

        Integer i5 = 1000;
        Integer i6 = 1000;
        System.out.println(i5 == i6);


        Object obj = true ? new Integer(1) : new Double(2.0);
        System.out.println(obj);
        // 表达式类型提升
        // byte+byte=int
        // int+double=double

    }
}
