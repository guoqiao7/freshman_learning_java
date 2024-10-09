package com.cskaoyan._05oop1._09static._02method;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/3 15:39
 **/
/*
静态成员方法
[访问权限修饰符] static 返回值类型 方法名(形参列表){
	//方法体
}
使用:
    通过类名.方法名(实参)
 */
public class Demo {
    public static void main(String[] args) {
        // 同一个类中,可以不使用类名.方法名进行调用 可以直接通过方法名调用
        m1();
        // 不同类的静态方法,使用的时候通过类名.静态方法(实参)
        Demo2.m3();

        // Math.pow();
    }
    public static void m1() {

    }
}
