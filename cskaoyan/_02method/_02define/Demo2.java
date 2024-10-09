package com.cskaoyan._02method._02define;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 9:33
 **/

/*
1. 在Java当中，main方法是程序的入口方法，
一个方法必须直接或间接地在main方法中调用才会被执行。
2. 对于修饰符列表中有static的方法，在同一个class的main方法中的调用方式是：
方法名(实际参数列表)
   > 注：实际上，同一个类中的static方法之间，都可以使用这种方式直接互相调用。
3. 调用一个有返回值的方法，实际上就是操作返回值，void方法没有返回值，不能做任何操作。
 */
public class Demo2 {
    public static void main(String[] args) {
        m1();
    }

    public static void m1() {
        m2();
    }
    public static void m2() {
        m3();
    }
    public static void m3() {

    }
}
