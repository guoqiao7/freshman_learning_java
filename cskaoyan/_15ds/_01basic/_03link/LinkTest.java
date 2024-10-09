package com.cskaoyan._15ds._01basic._03link;

import org.junit.Test;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/22 9:17
 **/

public class LinkTest {
    @Test
    public void testSingleLinked() {
        Node zs = new Node("zs");
        Node ls = new Node("ls");
        Node ww = new Node("ww");
        Node zl = new Node("zl");
        // 单链表
        zs.next = ls;
        ls.next = ww;
        ww.next = zl;
        System.out.println(zs);
        // zs-->ls--->ww--->zl
    }

    @Test
    public void testCircleLinked() {
        Node zs = new Node("zs");
        Node ls = new Node("ls");
        Node ww = new Node("ww");
        Node zl = new Node("zl");
        // 循环链表
        zs.next = ls;
        ls.next = ww;
        ww.next = zl;
        zl.next = zs;
        // System.out.println(zs);

        //zs-->ls--->ww--->zl--->zs
    }

    @Test
    public void testDBLinked() {
        DBNode a = new DBNode("a");
        DBNode b = new DBNode("b");
        DBNode c = new DBNode("c");
        DBNode d = new DBNode("d");
        // 双向链表
        // a<--->b<--->c<---->d
        a.next = b;
        b.pre = a;
        b.next = c;
        c.pre = b;
        c.next = d;
        d.pre = c;
    }

    @Test
    public void testDBCircleLinked() {
        DBNode a = new DBNode("a");
        DBNode b = new DBNode("b");
        DBNode c = new DBNode("c");
        DBNode d = new DBNode("d");

        // a<--->b<--->c<---->d<--->a
        a.next = b;
        b.pre = a;
        b.next = c;
        c.pre = b;
        c.next = d;
        d.pre = c;
        d.next = a;
        a.pre = d;
    }
}
