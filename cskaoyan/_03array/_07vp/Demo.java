package com.cskaoyan._03array._07vp;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/31 10:54
 **/
/*
可变长参数
可变参数适用于：参数个数不确定，类型确定的情况，Java会自动把可变参数当作数组处理。

[修饰符列表] 返回值类型 方法名 (形式参数列表,数据类型... 变量名){
	//方法体
}
注意:
    只能有1个可变长的参数
 */
public class Demo {
    public static void main(String[] args) {

        // 调用m1()
        m1();
        m1(1);
        m1(1,2);
        m1(1,2,3);

        // 调用m2()
        m2("aaa");
        m2("aaa",1);
        m2("aaa",1,2);

        // 可变长参数的本质是数组
        int[] arr = {1, 2, 3};
        m1(arr);

    }

    public static void m1(int... params) {
        System.out.println(111);
        for (int param : params) {
            System.out.println(param);
        }
    }
    public static void m2(String s,int... params) {

    }

    // Vararg parameter must be the last in the list
    //public static void m3(int... params,String s) {
    //
    //}

    //public static void m4(double... args, int... params) {
    //
    //}
}
