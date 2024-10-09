package com.cskaoyan._09string._04sort;

import java.util.Arrays;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/10 9:15
 **/

public class Demo {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // int--->Integer
        String[] strs = {"aa","abcd", "ab", "abc", };
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));

    }
}
