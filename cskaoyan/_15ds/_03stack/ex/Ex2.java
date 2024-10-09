package com.cskaoyan._15ds._03stack.ex;

import com.cskaoyan._15ds._03stack.MyArrayStack;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/23 15:57
 **/
// 反序字符串 借助于栈
public class Ex2 {
    public static void main(String[] args) {
        // 定义字符串
        String str = "abcdef";
        // abcdef--->fedcba
        // 创建一个栈
        MyArrayStack<Character> stack = new MyArrayStack<>();
        // 遍历字符串依次入栈
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        // 循环结束 全部字符入栈
        // 创建StringBuffer对象
        StringBuffer sb = new StringBuffer();
        while (!stack.isEmpty()) {
            // 弹出栈顶元素
            Character c = stack.pop();
            sb.append(c);
        }
        System.out.println("sb = " + sb);
    }
}
