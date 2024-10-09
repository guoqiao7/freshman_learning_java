package com.cskaoyan._03array._06opertions._04sort;

import java.util.Arrays;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/31 9:36
 **/

public class Demo {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 5, 4};
        // 利用工具进行排序
        System.out.println(Arrays.toString(arr));

        // Arrays.sort()
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
