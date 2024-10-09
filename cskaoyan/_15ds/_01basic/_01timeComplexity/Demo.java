package com.cskaoyan._15ds._01basic._01timeComplexity;

import org.junit.Test;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/22 8:48
 **/
/*
常见的时间复杂度
    常数阶 o(1)
    对数阶 o(log n)
    线性阶 o(n)
    平方阶 o(n^2)
    立方阶 o(n^3)
 */
public class Demo {
    @Test
    public void test1() {
        // 常数阶 o(1)
        int i = 1;
        System.out.println(i);
    }

    @Test
    public void test2() {
        //    对数阶 o(log n)
        // 2 ^ x = 100 ===> x = log2(100) ---> log2 N
        int i = 100;
        while (i < 100) {
            i = i*2;
        }
        System.out.println(i);
    }

    @Test
    public void test3() {
        //    线性阶 o(n)
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
    }

    @Test
    public void test4() {
        //     平方阶 o(n^2)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i*j);
            }
        }
    }

    @Test
    public void test5() {
        //     立方阶 o(n^3)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {

                    System.out.println(i*j*k);
                }
            }
        }
    }
}
