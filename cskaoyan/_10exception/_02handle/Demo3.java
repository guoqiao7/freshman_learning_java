package com.cskaoyan._10exception._02handle;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/11 10:17
 **/

public class Demo3 {
    public static void main(String[] args) {
        // 可能出现异常的代码
        // 使用快捷键 ctrl+alt+T
        try {
            System.out.println("main start");
            System.out.println(10 / 0);
            System.out.println("main end");
        } catch (Exception e) {
            // 主动抛出了一个运行时异常对象
            // throw new RuntimeException(e);
            // e.printStackTrace();
            System.out.println("捕获到了异常信息");
        }
        System.out.println(11111);
    }
}
