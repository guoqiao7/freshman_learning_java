package com.cskaoyan._13thread._01introduction;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/15 9:37
 **/

public class Demo3 {
    public static void main(String[] args) {
        while (true) {
            int[] ints = new int[1024 * 1024 * 100];
            // 休眠
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
