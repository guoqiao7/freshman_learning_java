package com.cskaoyan._03array._04memory;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 15:43
 **/
/*
通过数组的动态初始化--->引用数据类型
 */
public class Demo3 {
    public static void main(String[] args) {
        int a = 1;
        int[] arr = new int[3];
        /*
         =赋值符号 把右边的东西赋值给左边
         =右边  new int[3]
         new表示在堆上开辟空间 创建 对象
         =左边 int[] arr--->局部变量(引用)--->栈上
         把数组对象的地址值赋值给了arr

         没有办法直接操作对象,只能通过引用间接的操作对象
         类似于遥控器 跟 电视的关键
         引用数据类型 = 引用+对象
         */
    }
}
