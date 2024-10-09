package com.cskaoyan._10exception._04thorw;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/11 10:55
 **/
/*
throw
在方法体中使用
主动在程序中抛出异常
每次只能抛出确定的某个异常对象

throw 异常对象
 */
public class Demo {
    static int[] arr = {1, 2, 3};
    public static void main(String[] args) throws CloneNotSupportedException {
        //int value = findValueByIndex(-1);
        //System.out.println(value);

        //try {
        //    func1();
        //} catch (CloneNotSupportedException e) {
        //    System.out.println("捕获到了克隆异常信息!");
        //}
        func1();
    }

    // throw + 运行时异常
    public static int findValueByIndex(int index) {
        // 假设这个方法表示根据下标去查找数组中的index位置的元素
        // 判断下标是否合法
        if (index < 0 || index >= arr.length) {
            // 不合法
            // throw + 运行时异常对象
            // throw new IllegalArgumentException("index不合法!");
            throw new RuntimeException("index 不合法!");
        }
        return arr[index];
    }

    // throw+编译时异常 结合throws关键字一起使用
    public static void func1() throws CloneNotSupportedException {
        // ....
        throw new CloneNotSupportedException("没有实现Cloneable接口!");
    }
}
