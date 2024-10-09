package com.cskaoyan._05oop1._09static._01introudction;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/3 14:39
 **/
/*
static修饰2种结构
    1.static修饰成员变量--->静态成员变量
    2.static修饰成员方法--->静态成员方法
    静态成员

静态成员变量:
    [访问权限修饰符] static 数据类型 变量名;
 */
public class Demo2 {
    // 成员位置
    // 静态成员变量
    static int a = 1;
    public static void main(String[] args) {
        // 访问静态成员 (不依赖与对象,依赖于类)
        // 使用习惯上 通过类名.静态成员名访问
        System.out.println(Demo2.a);
        System.out.println(Demo2.name);

        // System.out.println(a);
        System.out.println(Math.PI);


        // 修改静态成员变量的取值
        Demo2.a = 10;
        System.out.println(Demo2.a);
    }

    // 成员位置
    static String name = "zs";
}
