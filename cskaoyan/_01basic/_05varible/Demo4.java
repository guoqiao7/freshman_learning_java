package com.cskaoyan._01basic._05varible;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 10:53
 **/

public class Demo4 {
    public static void main(String[] args) {
        double a = 0.1;
        float b = 0.1F;
        System.out.println(a == b);
        System.out.println(0.2 == 0.2);
        double c = 0.2;
        float d = 0.2F;
        System.out.println(c==d);

        float e = 0.1F;
        float f = 0.10000000000000000001F; //中间18个0
        System.out.println(e == f);
    }

}
