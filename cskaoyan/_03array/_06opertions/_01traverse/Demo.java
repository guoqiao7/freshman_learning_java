package com.cskaoyan._03array._06opertions._01traverse;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/31 8:53
 **/
/*
数组的遍历操作
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // 方法名(实参)
        // traverse1(arr);
        // traverse2(arr);
        // traverse3(arr);
        traverse4(arr);
    }

    public static void traverse1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // [1,2,3,4,5]
    public static void traverse2(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(",");
        }
        System.out.print("]");

    }
    // [1,2,3,4,5,]

    public static void traverse3(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(",");
        }
        System.out.print("\b]");

    }

    public static void traverse4(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            // 做一下判断
            if (i != arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");

    }
}
