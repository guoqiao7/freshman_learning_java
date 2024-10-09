package com.cskaoyan._01basic._08operator;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 14:51
 **/

public class Demo3 {
    public static void main(String[] args) {
        //int a =1;
        //a = ++a;
        //System.out.println(a);

        int x = 4;
        //       4   +    6  +   (6*10)
        int y = (x++) + (++x) + (x*10);
        // 70
        System.out.println("y = " + y);
    }
}
