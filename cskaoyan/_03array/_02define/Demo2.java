package com.cskaoyan._03array._02define;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 14:35
 **/
/*
数组的初始化
    静态初始化
        数据类型[] 数组名 = new 数据类型[]{元素1,元素2...}
    动态初始化
        数据类型[] 数组名 = new 数据类型[数组长度];

要么用静态 要么用动态 不要动静结合
数组名 = new 数据类型[数组长度]{元素1,元素2,元素3...};❌
 */
public class Demo2 {
    public static void main(String[] args) {
        // 静态初始化
        // 数据类型[] 数组名 = new 数据类型[]{元素1,元素2...}
        // new 表示在堆上分配空间 创建对象
        int[] arr1 = new int[]{1, 2, 3, 4};
        System.out.println(arr1);
        // [I@677327b6
        // [一维数组
        // @固定写法
        // 677327b6地址值
        // 静态初始化的简写方式 new 数据类型[]省略掉
        // 简写的时候必须和声明放在一起才可以
        int[] arr2 = {1,1,1,1,1};
        //int[] arr3;
        //arr3 = {1,1,1};


        // 动态初始化
        // 数据类型[] 数组名 = new 数据类型[数组长度];
        int[] arr4 = new int[5];
        arr4[0] = 1;
        arr4[1] = 2;
        arr4[2] = 3;
        arr4[3] = 4;
        arr4[4] = 5;

        // 不要两种方式一起使用
        // int[] arr5 = new int[3]{1,2,3};
    }
}
