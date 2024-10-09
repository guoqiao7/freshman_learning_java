package com.cskaoyan._03array._03use;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 14:52
 **/

/*
数组的基本操作:
1.打印地址值
2.访问数组元素
3.修改数组元素  通过数组下标操作
4.获取数组的长度
 */
public class Demo {
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = {1, 2, 3};
        System.out.println(arr.length);
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        // System.out.println(arr[3]);

        arr[0] = 100;
        System.out.println(arr[0]);
    }
}
