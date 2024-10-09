package com.cskaoyan._10exception._02handle;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/11 10:28
 **/
/*
try-catch多分支
try{
//....
}catch(){
}catch(){
}catch(){
}...
 */
public class Demo5 {
    public static void main(String[] args) {
        try {
            System.out.println("main start");
            System.out.println(10 / 0);
            // ...
            // 假设有个空指针
            System.out.println("main end");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界异常");
        } catch (ArithmeticException e) {
            System.out.println("算数异常");
        } catch (RuntimeException e) {
            System.out.println("空指针异常");
        }
        // 多个catch中的类型有父子关系 儿子在上 父亲在下
        System.out.println(1111);
    }
}
