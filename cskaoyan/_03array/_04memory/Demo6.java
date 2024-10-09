package com.cskaoyan._03array._04memory;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 16:57
 **/
/*
定义两个数组：

- 静态初始化一个数组，输出数组名，元素取值，长度
- 然后声明第二个数组，把第一个数组的地址赋值给第二个数组。
- 输出第二个数组的数组名，元素取值，长度
- 然后给第二个数组赋值，再次输出两个数组的名及元素
 */
public class Demo6 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1};
        int[] arr2 = arr1;
        System.out.println("---arr1--");
        System.out.println(arr1);
        System.out.println(arr1.length);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

        System.out.println("---arr2--");
        System.out.println(arr2);
        System.out.println(arr2.length);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);


        // 通过arr2修改元素数据
        arr2[0] = 2;
        arr2[1] = 2;
        arr2[2] = 2;

        System.out.println("---通过arr2修改元素数据---");
        System.out.println("---arr1--");
        System.out.println(arr1);
        System.out.println(arr1.length);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

        System.out.println("---arr2--");
        System.out.println(arr2);
        System.out.println(arr2.length);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
    }
}
