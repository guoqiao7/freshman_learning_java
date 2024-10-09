package com.cskaoyan._03array._06opertions._01traverse;

import java.util.Arrays;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/31 9:03
 **/

/*
使用foreach增强for循环  迭代器

for(数据类型 变量名 : 要遍历的数组或者集合){
	System.out.println(变量名);
}
 */
public class Demo3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // foreach
        //for (int value : arr) {
        //    // do sth
        //    System.out.println(value);
        //}

        // 快捷键 遍历的数组.for
        //for (int e : arr) {
        //    System.out.println(e);
        //}

        // 可以使用增强for来访问元素 但是不能修改值
        for (int e : arr) {
           e++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
