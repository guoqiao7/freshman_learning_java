package com.cskaoyan._15ds._03stack.ex;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/23 15:54
 **/
/*
栈的应用:
1, 函数调用栈
2, 反序字符串
3, 括号匹配问题 ( [ {
4, 编译器利用栈实现`表达式求值`
5, 浏览器的前进后退功能
6, 利用栈实现 DFS: depth-first-search  深度优先遍历
 */
public class Ex1 {
    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        test2();
    }

    private static void test2() {
        test3();
    }

    private static void test3() {
    }
}
