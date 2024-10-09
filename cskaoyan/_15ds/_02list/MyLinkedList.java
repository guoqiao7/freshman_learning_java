package com.cskaoyan._15ds._02list;

import java.util.Objects;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/22 15:36
 **/
// 线性表的链式存储--->底层使用单链表
public class MyLinkedList {
    // 基本结构
    private Node head;

    private int size;
    // 节点结构
    private class Node{
        // 内部类
        // 数据域
        String value;
        // 指针域
        Node next;

        public Node(String value) {
            this.value = value;
        }
    }

    // 获取size的方法
    public int size() {
        return size;
    }

    // 判断是否为空的方法
    public boolean isEmpty() {
        // return head == null;
        return size == 0;
    }

    // 基于内容的增删改查
    // 基于内容的增
    public boolean add(String value) {
        // 判断链表是否为空
        if (isEmpty()) {
            // 处理头
            // 创建新节点
            Node node = new Node(value);
            // 让新节点作为头
            head = node;
            // 表长+1
            size++;
            // 返回结果
            return true;
        }

        // 处理后续 默认添加到尾部
        // ===>找到末尾节点
        // 定义临时节点用于遍历
        Node mid = head;
        // 遍历
        while (mid.next != null) {
            // 移动mid 逻辑后移
            mid = mid.next;
        }
        // 循环结束了 mid这个节点就是尾节点
        // 创建新节点 添加到尾部
        Node node = new Node(value);
        mid.next = node;
        // 表长+1
        size++;
        // 返回结果
        return true;

    }
    // 基于内容的删
    public boolean remove(String value) {
        // 判断链表是否为空
        if (isEmpty()) {
            throw new RuntimeException("list is empty!");
        }
        // 处理头
        if (Objects.equals(head.value, value)) {
            // 删除头
            // 修改head
            head = head.next;
            // 表长-1
            size--;
            // 返回结果
            return true;
        }

        // 处理中间 尾部
        // 定义一个节点用于遍历
        Node mid = head;
        // 循环条件
        // 1. mid.next != null
        // 2. !Objects.equals(mid.next.value, value)
        while (mid.next != null && !Objects.equals(mid.next.value, value)) {
            // mid逻辑后移
            mid = mid.next;
        }
        // 跳出循环条件
        // 1.mid.next == null ---> 末尾 ---> 链表中没有存储该value
        if (mid.next == null) {
            // false
            // 异常
            throw new RuntimeException("not store!");
        }
        // 2.找到了 mid的下个节点是要删除的节点
        mid.next = mid.next.next;
        // 表长-1
        size--;
        // 返回结果
        return true;
    }
    // 基于内容的查
    public boolean contains(String value) {
        // 判空
        if (isEmpty()) {
            throw new RuntimeException("list is empty!");
        }
        // 定义一个节点用于遍历
        Node mid = head;
        while (mid != null) {
            if (Objects.equals(mid.value, value)) {
                // 找到了
                // 返回结果
                return true;
            }
            // mid 逻辑后移
            mid = mid.next;
        }
        // 链表中没存value
        return false;
    }

    // 基于内容的改
    public boolean set(String oldValue,String newValue) {
        // 判断空
        if (isEmpty()) {
            throw new RuntimeException("list is empty!");
        }
        // 定义一个节点用于遍历
        Node mid = head;
        while (mid != null) {
            if (Objects.equals(mid.value, oldValue)) {
                // 找到了
                // 此时 mid节点即为要修改的节点
                mid.value = newValue;
                return true;
            }
            // mid逻辑后移
            mid = mid.next;
        }
        return false;
    }

    // 基于下标的增删改查
    // 基于下标的增
    public boolean add(int index, String value) {
        if (index < 0 || index > size) {
            throw new RuntimeException("index is illegal!");
        }
        // 先处理头
        // index = 0
        if (index == 0) {
            //if (isEmpty()) {
            //    // 创建新节点
            //    Node node = new Node(value);
            //    // 新节点作为头
            //    head = node;
            //
            //}else {
            //    // 有节点存在
            //    Node node = new Node(value);
            //    node.next = head;
            //    // 让新节点作为头
            //    head = node;
            //}
            Node node = new Node(value);
            node.next = head;
            // 让新节点作为头
            head = node;
            // 表长+1
            size++;
            // 返回结果
            return true;
        }
        // 处理中间和尾
        // ==>要找到插入的位置
        // 定义一个节点用于遍历
        Node mid = head;
        int tag = 1;
        while (tag != index) {
            // 逻辑后移
            mid = mid.next;
            tag++;
        }
        // 跳出循环 tag == index
        // mid节点的下个位置就是要插入的位置
        // 创建新节点
        Node node = new Node(value);
        // 插入
        node.next = mid.next;
        mid.next = node;
        // 表长+1;
        size++;
        return true;
    }
    // 基于下标的删
    public String remove(int index) {
        // 判断index合法
        if (index < 0 || index >= size) {
            throw new RuntimeException("index is illegal");
        }

        // 先处理头
        if (index == 0) {
            // 把要删除的节点元素值取出来
            String removeValue = head.value;
            // 删除head 逻辑后移
            head = head.next;
            // 表长-1
            size--;
            // 返回被删除的元素值
            return removeValue;
        }
        // 再处理后续
        // 找到要删除的位置
        // 定义一个节点用于遍历
        Node mid =head;
        int tag = 1;
        while (index != tag) {
            // mid逻辑后移
            mid = mid.next;
            tag++;
        }
        // 循环结束 要删除的节点为mid的下个节点
        String removeValue = mid.next.value;
        // 删除
        mid.next = mid.next.next;
        // 表长-1
        size--;
        return removeValue;

    }

    // 基于下标的查
    public String contains(int index) {
        return null;
    }

    // 基于下标的改
    public String set(int index, String value) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("index is illegal!");
        }
        // 关键在于找到要修改的节点
        // 定义一个节点用于遍历
        Node mid = head;
        int tag = 0;
        while (tag != index) {
            // mid逻辑后移
            mid = mid.next;
            tag++;
        }
        // mid这个节点就是要修改的节点
        String oldValue = mid.value;
        mid.value = value;
        // 返回被修改的节点的value
        return oldValue;
    }
}

