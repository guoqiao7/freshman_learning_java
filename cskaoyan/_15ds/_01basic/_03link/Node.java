package com.cskaoyan._15ds._01basic._03link;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/22 9:15
 **/

public class Node {
    // 数据域
    String value;
    // 指针域
    Node next;

    public Node(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                ", next=" + next +
                '}';
    }
}
