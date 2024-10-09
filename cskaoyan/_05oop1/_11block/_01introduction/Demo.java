package com.cskaoyan._05oop1._11block._01introduction;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/3 17:08
 **/
/*
代码块的分类:
1.局部代码块
2.构造代码块
3.静态代码块
4.同步代码块
    用在多线程中,保证线程安全的
    synchronized(){
        同步代码块
    }
 */
public class Demo {
    public static void main(String[] args) {
        {
            // 局部代码块
            int a = 1;
        }
        // Cannot resolve symbol 'a'
        // System.out.println(a);
        {
            // 局部代码块
        }
    }
}
