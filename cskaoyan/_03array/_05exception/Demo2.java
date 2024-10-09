package com.cskaoyan._03array._05exception;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 17:15
 **/

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        // java.lang.ArrayIndexOutOfBoundsException: 3
        // 数组下标越界
        // System.out.println(arr[3]);

        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
