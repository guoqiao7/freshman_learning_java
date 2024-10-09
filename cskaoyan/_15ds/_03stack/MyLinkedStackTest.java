package com.cskaoyan._15ds._03stack;

import org.junit.Test;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/23 14:13
 **/

public class MyLinkedStackTest {
    @Test
    public void testPush() {
        MyLinkedStack<String> stack = new MyLinkedStack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
    }

    @Test
    public void testPop() {
        MyLinkedStack<String> stack = new MyLinkedStack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");

        System.out.println(stack.peek());
        System.out.println(stack.size());

        //String pop1 = stack.pop();
        //String pop2 = stack.pop();
        //String pop3 = stack.pop();
        //String pop4 = stack.pop();
        //while (!stack.isEmpty()) {
        //    System.out.println(stack.pop());
        //}
    }
}
