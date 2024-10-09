package com.cskaoyan._15ds._01basic._03link;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/22 9:22
 **/
// 双向链表的节点结构
public class DBNode {
    // 数据域
    String value;
    // 指针域
    DBNode next;
    DBNode pre;

    public DBNode(String value) {
        this.value = value;
    }
}
