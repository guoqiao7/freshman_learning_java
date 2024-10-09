package com.cskaoyan._15ds._01basic._02array;

import org.junit.Test;

import java.util.Arrays;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/22 8:58
 **/

public class ArrayTest {
    @Test
    public void test1() {
        // 创建数组
        Integer[] arr = new Integer[10];
        // 基本操作
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;

        System.out.println(arr[0]);
        System.out.println(arr[1]);

        arr[4] = null;
    }


    @Test
    public void test2() {
        // 创建数组
        Integer[] arr = new Integer[10];
        // 基本操作
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;

        // 向数组中插入元素
        // 最好情况  插入到末尾
        arr[5] = 5;
        System.out.println(Arrays.toString(arr));

        // 最坏情况
        // 插入到开头
        // 后续元素往后移动一位
        for (int i = arr.length-1; i >0 ; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = 6;
        System.out.println(Arrays.toString(arr));
    }


    @Test
    public void test3() {
        // 创建数组
        Integer[] arr = new Integer[10];
        // 基本操作
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;

        // 向数组中删除元素
        // 最好情况  删除末尾
        arr[4] = null;
        System.out.println(Arrays.toString(arr));

        // 最坏情况
        // 删除开头
        // 后续元素往前移动一位
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println(Arrays.toString(arr));

    }

    @Test
    public void test4() {
        // 创建数组
        Integer[] arr = new Integer[10];
        // 基本操作
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;

        // 基于下标查找
        // o(1)
        System.out.println(arr[1]);

        // 基于内容查找
        // 遍历操作
        for (Integer i : arr) {
            if (i == 3) {
                System.out.println("find success");
            }
        }
    }
}
