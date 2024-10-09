package com.cskaoyan._01basic._05varible;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 10:22
 **/

/*
局部变量:
    定义在局部位置的变量
什么是局部位置?
    类体中,方法内部,或者代码块内部{ }
局部变量的作用域
    只在作用域内生效
 */
public class Demo {
    public static void main(String[] args) {
        // 局部位置
        int a = 1;
        {
            // 局部位置
            int b = 1;
            // Variable 'a' is already defined in the scope
            // 同一作用域内不能定义同名的变量名
            // int a = 1;
            System.out.println(a);
        }
        // Cannot resolve symbol 'b
        //System.out.println(b);
        if (true) {
            // 局部位置
            // 局部变量
        }
        // fori 快捷键
        int num2 = 1;
        for (int i = 0; i < 3; i++) {
            // 局部位置
            // 局部变量
            //int num = 1;
            //num++;
            //System.out.println(num);
            num2++;
            System.out.println(num2);
        }

    }

    public static void test() {
        // 局部位置
    }
}
