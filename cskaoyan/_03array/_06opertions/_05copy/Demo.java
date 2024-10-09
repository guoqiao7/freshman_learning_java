package com.cskaoyan._03array._06opertions._05copy;

import java.util.Arrays;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/31 10:03
 **/
/*
1.向数组中添加元素
2.从数组中删除某个元素[1,2,3,3] --->删除3 [1,2]
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3};
        //int[] newArray = addElementToArray(arr,5);
        //int[] newArray = addElementToArray2(arr,5);
        // System.out.println(Arrays.toString(newArray));
        //int[] copy = copy(arr);
        //System.out.println(Arrays.toString(copy));

        int[] newArray = removeElementFromArray(arr, 3);
        System.out.println(Arrays.toString(newArray));

    }

    // 向数组中添加元素
    // arr--->老数组
    // value--->新数据
    public static int[] addElementToArray(int[] arr,int value) {
        // 创建新数组
        int[] newArray = new int[arr.length + 1];
        // 把老数组中的元素依次复制到新数组
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        // 新数据插入到新数组的末尾
        newArray[newArray.length - 1] = value;
        // 返回新数组
        return newArray;
    }

    public static int[] addElementToArray2(int[] arr,int value) {
        // 创建新数组
        int[] newArray = new int[arr.length + 1];
        // 定义一个数组下标
        int index = 0;

        // 把老数组中的元素依次复制到新数组
        for (int element : arr) {
            newArray[index] = element;
            index++;
        }
        // 插入新数据
        newArray[index] = value;
        // 返回新数组
        return newArray;
    }

    public static int[] copy(int[] old) {
        int[] newArray = new int[old.length];
        // 使用一个复制的方法 System.arraycopy();
        System.arraycopy(old, 0, newArray, 0, old.length);
        // 返回新数组
        return newArray;
    }

    /*
    参数: 老数组 , 要删除的value值
    return: 返回删除后的新数组
     */
    public static int[] removeElementFromArray(int[] old,int value) {
        // 统计要删除的元素的个数
        int count = 0;
        // 遍历老数组
        for (int e : old) {
            if (e == value) {
                count++;
            }
        }
        // 根据元素个数创建新数组
        int[] newArray = new int[old.length - count];
        // 把老数组元素复制到新数组中
        int index=0;
        for (int element : old) {
            if (element == value) {
                // 啥也不干
                // 结束本次循环
                continue;
            }
            newArray[index++] = element;
        }
        // 返回删除后的新数组
        return newArray;
    }
}
