package com.cskaoyan._04recrussion._03case;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/2 10:12
 **/
/*
斐波那契(Feibonacci)数列

1, 1 , 2 , 3 , 5 , 8 , 13 , 21.....

求第n个位置的值是多少
f(1) = 1
f(2) = 1
f(3) = 1+1 = f(1) + f(2)
f(4) = 1+2= 3 = f(2)+f(3)
...
f(n) = f(n-2)+f(n-1)


 */
public class Demo {
    public static void main(String[] args) {
        int n = 7;
        int result = getFeibonacci(n);
        System.out.println(result);
    }

    public static int getFeibonacci(int n) {
        // 出口
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        // 递归体
        //f(n) = f(n-2)+f(n-1)
        return getFeibonacci(n - 2) + getFeibonacci(n - 1);
    }


}
