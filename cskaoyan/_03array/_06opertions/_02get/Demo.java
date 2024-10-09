package com.cskaoyan._03array._06opertions._02get;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/31 9:09
 **/
/*
获取数组中的最值，包括获取最大值和最小值，也是常见操作。
具体思路：
1. 任取一个元素**（一般选择第一个元素）**作为参照物。
2. 遍历其他元素，依次比较，选择出更大/小的值，类似于打擂台。
3. 最终获取最值。
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 4};

        int maxValue = getMaxValue(arr);
        System.out.println(maxValue);

        // [3,2,1,5,4]--->sort [1,2,3,4,5]
    }

    public static int getMaxValue(int[] arr) {
        // 取第一个元素作为临时最大值
        int max = arr[0];
        // 数组遍历
        for (int element : arr) {
            // 值的大小比较
            // 如果比临时最大值大 ,替换
            if (element > max) {
                max = element;
            }
            // 遍历结束 --> 返回最大值

        }
        return max;
    }


    public static int getMinValue(int[] arr) {
        // 取第一个元素作为临时最小值
        int min = arr[0];
        // 数组遍历
        for (int element : arr) {
            // 值的大小比较
            // 如果比临时最大值大 ,替换
            if (element < min) {
                min = element;
            }
            // 遍历结束 --> 返回最大值

        }
        return min;
    }
}
