package com.cskaoyan._15ds._03stack;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/23 14:05
 **/
// 栈的链式存储 ---> 底层使用单链表
public class MyLinkedStack<E> {
    // 栈顶指针
    private Node top;
    private int size;
    // 节点结构
    private class Node{
        // 数据域
        E value;
        // 指针域
        Node next;

        public Node(E value) {
            this.value = value;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // 入栈 push
    public boolean push(E value) {
        // 以链表的top来作为栈顶
        // 使用头插法
        // 判断栈空
        if (isEmpty()) {
            // 创建新节点
            Node node = new Node(value);
            // 修改top
            top = node;
            // 表长+1
            size++;
            //返回结果
            return true;
        }
        // 创建新节点
        Node node = new Node(value);
        // 跟链表进行连接
        node.next = top;
        // 修改top
        top = node;
        // 表长+1
        size++;
        // 返回结果
        return true;

    }

    // 出栈 pop
    public E pop() {
        // 判断栈空
        if (isEmpty()) {
            throw new RuntimeException("stack is empty!");
        }
        // 取出栈顶元素
        E topValue = top.value;
        // 修改top
        top = top.next;
        // 表长-1
        size--;
        return topValue;
    }

    public E peek() {
        // 判断栈空
        if (isEmpty()) {
            throw new RuntimeException("stack is empty!");
        }
        return top.value;
    }
}
