package com.cskaoyan._01basic._12loop;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 17:24
 **/
/*
######
######
######
######
 */
public class Demo5 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print("#");
            }
            System.out.println(); // "\r\n"
        }
    }
}
