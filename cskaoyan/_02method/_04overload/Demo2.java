package com.cskaoyan._02method._04overload;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 10:33
 **/
/*
形参列表不同意味着：
1. 形参数量不同
2. 形参数量相同时，形参的数据类型不同
3. 形参数量和数据类型都相同时，形参的数据类型的顺序不同
除开上述条件外，其余的任何不同都无法构成方法重载， <font color=red>**经典的错误**</font>有：

1. 形参的名字不同，可以构成方法重载<font color=red>✖</font>
2. 返回值类型不同，可以构成方法重载<font color=red>✖</font>
3. 修饰符列表不同，可以构成方法重载<font color=red>✖</font>
 */
public class Demo2 {
    public static void main(String[] args) {
        m1(1);
        m1(1,1);

        m2(1,1);
        m2(1,"aaa");
    }

    public static void m1(int a) {

    }
    public static void m1(int a,int b) {

    }
    public static void m2(int a,String s) {

    }
    public static void m2(int a,int b) {

    }

    public static void m3(int a,String s) {

    }
    public static void m3(String s,int a) {

    }

    public static void m3(int[] arr) {

    }

}
