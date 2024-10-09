package com.cskaoyan._01basic._09scanner;

import java.util.Random;
import java.util.Scanner;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 16:29
 **/

/*
猜数字小游戏

随机生成一个随机数(0-100),
使用scanner能多次接收一个int数据, 跟随机数进行比较, 大于或者小于要求给出提示,
重新输入, 直到跟这个随机数相等, 结束.
 */
public class Demo4 {
    public static void main(String[] args) {
        // 随机数 使用Random
        Random random = new Random();
        // nextInt(bound) [0,bound)
        int randomNum = random.nextInt(101);
        //System.out.println(randomNum);

        // 创建scanner对象
        Scanner scanner = new Scanner(System.in);
        // 使用循环
        while (true) {
            System.out.println("请输入一个正整数:");
            // 键盘接收一整数
            int i = scanner.nextInt();
            // 跟随机数进行比较
            if (i > randomNum) {
                System.out.println("输入过大,重输入");
            }else if(i< randomNum) {
                System.out.println("输入过小,重输入");
                // 给出相应提示
                // 满足条件结束循环

            }else{
                System.out.println("匹配成功");
                // 跳出循环
                break;
            }
        }
    }
}
