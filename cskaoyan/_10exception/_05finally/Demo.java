package com.cskaoyan._10exception._05finally;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/11 14:32
 **/
/*
语法:方式一
try{

}catch(){

}catch(){

}.....
finally{
    // 一定执行
}
 */
public class Demo {
    public static void main(String[] args) {
        try {
            System.out.println("main start");
            System.out.println(10 / 0);

            // 释放资源的操作....
            System.out.println("main end");
        } catch (NullPointerException e) {
            System.out.println("空指针");
        } catch (ArithmeticException e) {
            System.out.println("算数异常");
        } finally {
            // 具有一定执行的特点 一般来进行资源的释放
            System.out.println("finally执行了");
        }
        System.out.println(1111);
    }
}
