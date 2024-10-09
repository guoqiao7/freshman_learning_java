package com.cskaoyan._15ds._04queuq;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/23 15:40
 **/
// 实现队列的链式存储 ---> 底层使用单链表
public class MyLinkedQueue<E> {
    // 基本结构
    // 队头
    private Node front;
    // 队尾
    private Node rear;

    private int size;

    // 节点结构
    private  class Node{
        E value;
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

    // 入队 offer
    public boolean offer(E value) {
        // 队列判空
        if (isEmpty()) {
            // 第一次添加
            // 创建一个新节点
            Node node = new Node(value);
            // 修改front rear
            front = rear = node;
            // 表长+1
            size++;
            // 返回结果
            return true;
        }
        // 创建新节点
        Node node = new Node(value);
        // 添加到队尾
        rear.next = node;
        // 修改rear
        rear = node;
        // 表长+1
        size++;
        // 返回结果
        return true;
    }

    // 出队 poll
    public E poll() {
        // 队空判断
        if (isEmpty()) {
            throw new RuntimeException("queue is empty!");
        }
        // 特殊情况: 队列中只有1个元素
        if (size == 1) {
            // 取出队头元素
            E value = front.value;
            // 修改front / rear
            front = rear = null;
            // 表长-1
            size--;
            // 返回结果
            return value;

        }
        // 一般情况
        // 取出队头元素
        E value = front.value;
        // 修改front 逻辑后移
        front = front.next;
        // 表长-1
        size--;
        // 返回队头元素
        return value;
    }
}
