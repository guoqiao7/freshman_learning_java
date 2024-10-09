package com.cskaoyan._15ds._01basic;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/20 11:11
 **/

public class Demo {
    public static void main(String[] args) {
        Node zs = new Node("zs");
        Node ls = new Node("ls");
        Node ww = new Node("ww");
        Node zl = new Node("zl");
        zs.next = ls;
        ls.next = ww;
        ww.next = zl;
        zl.next = ls;
        // zs--->ls--->ww--->zl--->ls
    }
}

class Node{
    String value;
    Node next;

    public Node(String value) {
        this.value = value;
    }
}