package com.cskaoyan._03array._05exception;

import java.util.Arrays;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 17:23
 **/

public class Demo4 {
    public static void main(String[] args) {
        // [1,2,3]
        int[] arr = {}; //[]
        System.out.println(arr);
        System.out.println(arr.length);
        // System.out.println(arr[0]);

        int[] result = getResult(10);
        if (result.length == 2) {
            System.out.println(result[0]);
            System.out.println(result[1]);
        }

    }

    // 长度为0的数组可以作为容器返回数据
    // 某个方法可能返回1个结果 可能返回2个结果 或者返回0个结果
    public static int[] getResult(int n) {
        int[] arr = {};
        // n>0 ---> 返回2个结果
        if (n > 0) {
            arr = new int[]{1, 2};
        }
        // n<>0 ---> 返回1个结果
        if (n < 0) {
            arr = new int[]{1};

        }
        // n=0  --->返回0个结果
        return arr;
    }
}
