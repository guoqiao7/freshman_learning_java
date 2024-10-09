package com.cskaoyan._01basic._12loop;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 17:20
 **/
/*
2. 用for循环求出1-100之间偶数和

 */
public class Demo3 {
    public static void main(String[] args) {
        // 快捷键 fori
        int sum = 0;
        //for (int i = 1; i <= 100; i++) {
        //    if (i % 2 == 0) {
        //        sum += i;
        //    }
        //}
        //System.out.println(sum);
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
    }
}
