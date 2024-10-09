package com.cskaoyan._15ds._03stack.ex;

import com.cskaoyan._15ds._03stack.MyArrayStack;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/23 16:04
 **/
/*
括号匹配问题

Ex3 {public static void main(String[] args) {   }}
 */
public class Ex3 {
    public static void main(String[] args) {
        String str = "Ex3 {public static void main(String[] args) {   }}";

        // 判断括号是否匹配
        boolean isMatch = judgeBracketMatch(str);
        System.out.println(isMatch);
    }

    private static boolean judgeBracketMatch(String str) {
        // 借助于栈
        // 创建一个栈
        MyArrayStack<Character> stack = new MyArrayStack<>();
        // 遍历字符串
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // 遇到左括号 入栈
            if (c == '(') {
                // 让相对应的右括号入栈
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == ')' || c == ']' || c == '}') {
                // 遇到右括号  弹栈
                // 考虑一下特殊情况 栈空
                if (stack.isEmpty()) {
                    return false;
                }
                Character popValue = stack.pop();
                if (c != popValue) {
                    return false;
                }
            }
        }
        System.out.println(stack.size());
        return stack.isEmpty();
    }
}
