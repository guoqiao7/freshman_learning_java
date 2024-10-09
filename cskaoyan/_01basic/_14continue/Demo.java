package com.cskaoyan._01basic._14continue;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 8:56
 **/
/*
**使用场景：**

continue不同于break，它只能在循环中使用，无法在循环外使用，如果使用，会编译不通过。

**作用：**

**continue在循环表示结束当前次的循环，转而继续执行后面的循环
 */
public class Demo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 1) {
                System.out.println("进入if");
                continue;
            }
            System.out.println(11111);
        }
    }
}
