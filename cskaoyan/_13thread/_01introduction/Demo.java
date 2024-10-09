package com.cskaoyan._13thread._01introduction;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/15 8:45
 **/
/*
假如我要实现如下功能
程序不停地在屏幕上输出一句问候的语句(比如“你好”)
“同时”，当我通过键盘输入固定输入的时候，程序停止向屏幕输出问候的语句(比如说输入gun)
 */
public class Demo {
    public static boolean flag = true;
    public static void main(String[] args) {
        System.out.println("sayhello before");
        sayHello();
        System.out.println("sayhello after");

        System.out.println("wait before");

        waitToStop();
        System.out.println("wait after");

    }

    public static void sayHello() {
        while (flag) {
            System.out.println("你好");
            // 让程序暂停执行3秒
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void waitToStop() {
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            String s = scanner.nextLine();
            if ("gun".equals(s)) {
                // 更改flag的值
                flag = false;
                break;
            }
        }
    }
}
