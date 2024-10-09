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

使用多线程改进

 */
public class Demo2 {
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
        // 把方法中的代码放到线程中运行
        new Thread(new Runnable() {
            @Override
            public void run() {
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
        }).start();

    }

    public static void waitToStop() {
        // 把方法中的代码放到线程中运行
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
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
        ).start();

    }
}
