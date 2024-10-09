package com.cskaoyan._10exception._02handle;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/11 10:10
 **/
/*
try-catch 单分支

方式一:
try{
   // 可能出现异常的代码
}catch(异常类型 对象名){
   // 对异常的处理操作
}
方式二:
try{
   // 可能出现异常的代码
}catch(异常类型1 | 异常类型2 | 异常类型3 | 对象名){
   // 对异常的处理操作
}

注意:
    catch中的代码,必须try中有异常,并且正常捕获到
 */
public class Demo2 {
    public static void main(String[] args) {
        try {
            // 可能出现异常的代码
            System.out.println("main start");
            System.out.println(10 / 0);
            System.out.println("main end");
        }
        //catch (ArithmeticException e) {
        //    // 对异常信息进行处理
        //    System.out.println("出现了算数异常!");
        //
        //}
        // 没有匹配成功
        catch (NullPointerException e) {
            // 对异常信息进行处理
            System.out.println("出现了算数异常!");

        }
        System.out.println(1111);
    }
}
