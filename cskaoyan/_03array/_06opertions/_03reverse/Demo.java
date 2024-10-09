package com.cskaoyan._03array._06opertions._03reverse;

import java.util.Arrays;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/31 9:18
 **/
/*
数组逆序
[1,2,3,4,5]----->[5,4,3,2,1]
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // 原数组
        System.out.println(Arrays.toString(arr));
        // 逆序
        // reverse1(arr);
        reverse2(arr);
        // 输出
        System.out.println(Arrays.toString(arr));

    }

    /*
    使用二分法  首尾进行交换
    注意:遍历一半
     */
    public static void reverse1(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            // 首尾元素的交换
            // 交换变量通常使用一个临时变量来保存数据
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
    /*
    定义2个标记
     */
    public static void reverse2(int[] arr) {
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            // 交换start跟end指向的元素
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
}

