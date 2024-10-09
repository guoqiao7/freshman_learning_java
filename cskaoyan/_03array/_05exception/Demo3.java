package com.cskaoyan._03array._05exception;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 17:18
 **/

public class Demo3 {
    public static void main(String[] args) {
        // 空指针异常
        // java.lang.NullPointerException
        int[] arr1 = {1, 1, 1};
        int[] arr2 = null;
        m1(arr2);
    }

    public static void m1(int[] arr) {
        // 判断是否为null
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

        }
    }
}
