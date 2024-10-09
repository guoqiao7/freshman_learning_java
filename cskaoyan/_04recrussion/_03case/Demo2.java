package com.cskaoyan._04recrussion._03case;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/2 10:17
 **/
/*
青蛙跳台阶
一只青蛙一次可以跳上一层台阶，也可以跳上两层，
求该青蛙跳上n层的台阶总共有多少种跳法（先后次序不同算不同的结果)
f(1) = 1
f(2) = 1+ 1 = 2
f(3) =  1+ 2 = 3 = f(1)+f(2)
f(4) = 1+1 + 3 = 5 = f(2)+ f(3)
....
f(n) = f(n-2) +f(n-1)
 */
public class Demo2 {
    public static void main(String[] args) {
        int n = 5;
        int num = jump(n);
        System.out.println(num);
    }

    public static int jump(int n) {
        // 递归出口
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        // 递归体
        //f(n) = f(n-2) +f(n-1)
        return jump(n - 2) + jump(n - 1);
    }
}
