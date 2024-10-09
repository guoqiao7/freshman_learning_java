package com.cskaoyan._03array._04memory;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 16:43
 **/
/*
通过数组的静态初始化-->赋值顺序
 */
public class Demo5 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1};
        System.out.println(arr);

        String[] arr2 = new String[]{"zs", "ls"};

        arr = null;
        System.out.println(arr);
    }
}
