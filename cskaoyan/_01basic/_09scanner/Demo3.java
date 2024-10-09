package com.cskaoyan._01basic._09scanner;

import java.util.Scanner;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 16:23
 **/
/*
模拟登陆功能
用户名(String):admin
密码(String): 123456

使用scanner进行输入, 匹配成功提示登陆成功, 否则登陆失败
 */
public class Demo3 {
    public static void main(String[] args) {
        // 定义用户名
        String userName = "admin";
        // 定义密码
        String password = "123456";
        // 创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        // 键盘接收数据
        // 接收用户名
        System.out.println("请输入用户名:");
        String user = scanner.nextLine();
        // 接收密码
        System.out.println("请输入用密码:");
        String pwd = scanner.nextLine();
        // 判断是否匹配
        if (user.equals(userName) && pwd.equals(password)) {
            // 给出相应的提示
            System.out.println("登录成功!");
        }else{
            System.out.println("登录失败!");
        }
    }
}
