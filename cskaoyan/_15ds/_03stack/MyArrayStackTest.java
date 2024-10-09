package com.cskaoyan._15ds._03stack;

import org.junit.Test;

import java.util.Stack;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/23 10:45
 **/

public class MyArrayStackTest {
    @Test
    public void testPush() {
        MyArrayStack<String> stack = new MyArrayStack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        stack.push("f");
        System.out.println(stack.size());
    }

    @Test
    public void testPush2() {
        MyArrayStack<Integer> stack = new MyArrayStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.size());
    }


    @Test
    public void testPop() {
        MyArrayStack<String> stack = new MyArrayStack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        stack.push("f");

        String s1 = stack.pop();
        String s2 = stack.pop();
        String s3 = stack.pop();
        String s4 = stack.pop();
    }

    @Test
    public void myTest() {
        // Java当中提供的有栈的容器
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        // System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
    }

    @Test
    public void testPeak() {
        MyArrayStack<String> stack = new MyArrayStack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        stack.push("f");

        String peekValue = stack.peek();
        System.out.println(peekValue);
    }
}
