package com.cskaoyan._03array._08call;

import java.util.Arrays;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/2 9:02
 **/

public class Demo3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1};
        int[] arr2 = {2, 2, 2};
        System.out.println("swap之前------");
        System.out.println("arr1 "+Arrays.toString(arr1));
        System.out.println("arr2 "+Arrays.toString(arr2));
        swap(arr1,arr2);

        System.out.println("main------");
        System.out.println("arr1 "+Arrays.toString(arr1));
        System.out.println("arr2 "+Arrays.toString(arr2));
    }
    public static void swap(int[] arr1,int[] arr2) {
        int[] temp;
        temp = arr1;
        arr1 = arr2;
        arr2 = temp;
        System.out.println("swap------");
        System.out.println("arr1 "+Arrays.toString(arr1));
        System.out.println("arr2 "+Arrays.toString(arr2));
    }
}
