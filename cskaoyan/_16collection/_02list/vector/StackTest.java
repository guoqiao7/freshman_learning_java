package com.cskaoyan._16collection._02list.vector;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/25 14:26
 **/

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("a");
        stack.pop();

        // A more complete and consistent set of LIFO stack
        // operations is provided by the Deque interface and
        // its implementations,
        // which should be used in preference to this class.
        // For example:
        Deque<Integer> stack2 = new ArrayDeque<Integer>();
        stack2.push(1);
        stack2.push(2);
        System.out.println(stack2.pop());
    }
}
