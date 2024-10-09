package com.cskaoyan._10exception._02handle;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/11 10:23
 **/

public class Demo4 {
    public static void main(String[] args) {
        // 单分支
        try {
            System.out.println("main start");
            System.out.println(10 / 0);
            // ...
            // 假设有个空指针
            System.out.println("main end");
        } catch (NullPointerException | ArithmeticException e) {
            // System.out.println("捕获到了异常信息");
            // //获取异常信息，返回字符串。
            //getMessage()
            //String message = e.getMessage();
            //System.out.println(message);

            ////获取异常类名和异常信息，返回字符串。
            //toString()
            // System.out.println(e.toString());
            ////获取异常类名和异常信息，以及异常出现在程序中的位置,并打印到控制台
            //printStackTrace()
            e.printStackTrace();
        }
    }
}
