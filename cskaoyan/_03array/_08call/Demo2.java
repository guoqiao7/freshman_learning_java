package com.cskaoyan._03array._08call;

import java.util.Arrays;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/2 8:55
 **/

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1};

        m1(arr);

        System.out.println("main-----"+Arrays.toString(arr));
    }

    public static void m1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }

        System.out.println("m1-----"+Arrays.toString(arr));

    }
}