package com.cskaoyan._10exception._05finally;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/11 14:40
 **/
/*
如果try中的异常不能正常捕获,但是finally中有return
 */
public class Demo6 {
    public static void main(String[] args) {
        try {
            System.out.println(111);
            System.out.println(10 / 0);
        } catch (RuntimeException e) {
            System.out.println("空指针异常");
        }
        finally{
            System.out.println("finally");
            return;
        }
        // System.out.println("2222");
    }
}
