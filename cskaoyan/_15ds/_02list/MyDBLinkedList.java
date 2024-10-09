package com.cskaoyan._15ds._02list;

import java.util.Objects;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/22 17:07
 **/
/*
底层使用双向链表存储
 */
public class MyDBLinkedList {
    // 基本结构
    // 头
    private Node head;
    // 尾
    private Node tail;

    private int size;


    // 节点结构
    private class Node{
        String value;
        // 指针域
        Node next;
        Node pre;

        public Node(String value) {
            this.value = value;
        }
    }

    // 获取容器大小的方法
    public int size() {
        return size;
    }

    // 判断是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 基于内容的添加操作
    public boolean add(String value) {
        // 判断空
        if (isEmpty()) {
            // 创建新节点
            Node node = new Node(value);
            // 修改head tail
            head = tail = node;
            // 表长+1
            size++;
            // 返回结果
            return true;
        }
        // 默认添加到末尾位置
        // 创建新节点
        Node node = new Node(value);
        // 挂在尾部
        node.pre = tail;
        tail.next = node;
        // 修改tail 新的节点作为尾节点
        tail = node;
        // 表长+1
        size++;
        // 返回结果
        return true;
    }

    // 基于内容的删除操作
    public boolean remove(String value) {
        // 判断空
        if (isEmpty()) {
            throw new RuntimeException("list is empty!");
        }
        // 处理头
        if (Objects.equals(head.value, value)) {
            if (size == 1) {
                // 如果只有1个节点
                // 修改head tail
                head = tail = null;
            } else {
                // 如果有多个节点
                // 修改head
                head = head.next;
                head.pre = null;
            }

            // 表长-1
            size--;
            // 返回结果
            return true;
        }
        // 定义节点用于遍历
        Node mid = head;
        while (mid.next != null && !Objects.equals(mid.next.value, value)) {
            // mid后移
            mid = mid.next;
        }
        // 1.mid.next == null
        if (mid.next == null) {
            // 没存
            return false;
        }
        // 2.找到了
        // mid.next就是要删除的节点 有可能在中间  有可能在尾
        Node removeNode = mid.next;
        // 处理尾
        if (removeNode.next == null) {
            // 删除尾
            removeNode.pre.next = null;
            // 修改tail 逻辑前移
            tail = removeNode.pre;
            // 表长-1
            size--;
            return true;
        }
        // 处理中间
        removeNode.next.pre = removeNode.pre;
        removeNode.pre.next = removeNode.next;
        // 表长-1
        size--;
        return true;


    }

    // 基于内容的查找
    public boolean contains(String value) {
        // 判断空
        if (isEmpty()) {
            throw new RuntimeException("list is empty");
        }
        // 定义节点用于遍历
        Node mid = head;
        while (mid != null) {
            if (Objects.equals(mid.value, value)) {
                // 找到了
                return true;
            }
            // mid逻辑后移
            mid = mid.next;
        }
        // 没存
        return false;
    }


    // 基于内容的修改
    public boolean contains(String oldValue,String newValue) {
        // 判断空
        if (isEmpty()) {
            throw new RuntimeException("list is empty");
        }
        // 定义节点用于遍历
        Node mid = head;
        while (mid != null) {
            if (Objects.equals(mid.value, oldValue)) {
                // 找到了
                mid.value = newValue;
                return true;
            }
            // mid逻辑后移
            mid = mid.next;
        }
        // 没存
        return false;
    }

    // 基于下标的添加操作
    public boolean add(int index, String value) {
        // index判断
        if (index < 0 || index > size) {
            throw new RuntimeException("index is illegal!");
        }
        // 先处理头
        if (index == 0) {
            Node node = new Node(value);

            if (isEmpty()) {
                // 如果是第一次添加
                // 创建新节点
                // 修改head tail
                head = tail = node;

            }else {
                // 如果不是第一次添加
                // 创建新节点
                // 修改head
                node.next = head;
                head.pre = node;
                // 新创建的节点作为新的头
                head = node;
            }
            // 表长+1
            size++;
            // 返回结果
            return true;
        }

        // 处理后续
        // 关键点在于index位置
        // 处理尾部
        if (index == size) {
            // 直接调用基于内容的添加
            return add(value);
        }

        // 定义一个节点用于遍历
        // 定义一个标记 用于index比较
        Node mid = head;
        int tag = 1;
        // 将链表分成左区域 和右区域
        if (index <= size / 2) {
            // 靠近head 从头往后找
            while (tag != index) {
                // mid逻辑后移
                mid = mid.next;
                tag++;
            }
        }else {
            // 右半区 靠近tail  从后往前找
            mid = tail;
            tag = size;
            while (tag != index) {
                mid = mid.pre;
                tag--;
            }
        }
        // mid节点的下个位置就是要插入的位置
        // 创建新节点
        Node node = new Node(value);
        // 新节点跟链表建立连接
        node.pre = mid;
        node.next = mid.next;
        // 修改next, pre
        // 链表中的节点也指向新的节点
        mid.next.pre = node;
        mid.next = node;

        // 表长+1
        size++;
        // 返回结果
        return true;

    }

    // 基于下标的删除操作
    public String remove(int index) {
        // 判断index
        if (index < 0 || index >= size) {
            throw new RuntimeException("index is illegal");
        }
        // 处理头
        if (index == 0) {
            String removeValue = head.value;
            if (size == 1) {
                // 只有1个节点
                // 修改head tail
                head = null;
                tail = null;
            }else{
                // 有多个节点
                // 修改head
                head = head.next;
                head.pre = null;
            }
            // 表长-1
            size--;
            // 返回被删除的元素
            return removeValue;
        }
        // 处理尾
        if (index == size - 1) {
            String removeValue = tail.value;
            // 删除
            // 修改tail
            tail = tail.pre;
            tail.next = null;
            // 表长-1
            size--;
            // 返回被删除元素
            return removeValue;
        }
        // 处理中间
        // 找index位置
        // 分成左区域 右区域
        Node mid = head;
        int tag = 1;
        if (index <= size / 2) {
            // 从头往后找
            while (tag != index) {
                //mid后移
                mid = mid.next;
                tag++;
            }
        }else {
            // 从后往前找
            mid = tail;
            tag = size;
            while (tag != index) {
                // mid前移
                mid = mid.pre;
                tag--;
            }
        }

        // mid节点的下个节点就是要删除的节点
        Node removeNode = mid.next;
        // 取出被删节点的元素数据
        String removeValue = removeNode.value;

        // 删除该节点
        removeNode.next.pre = removeNode.pre;
        removeNode.pre.next = removeNode.next;
        // 表长-1
        size--;
        // 返回结果
        return removeValue;
    }

    // 基于下标的查找
    public String contains(int index) {
        // 判断index
        if (index < 0 || index >= size) {
            throw new RuntimeException("index is illegal!");
        }
        // 寻找index位置
        // 定义一个节点用于遍历
        Node mid = head;
        // 定义一个标记用于比较index
        int tag = 0;
        if (index < size / 2) {
            // 左半区寻找
            while (index != tag) {
                // mid后移
                mid = mid.next;
                tag++;
            }
        }else{
            // 右半区寻找
            mid = tail;
            tag = size - 1;
            while (tag != index) {
                // mid前移
                mid = mid.pre;
                tag--;
            }
        }
        // 处理 mid这个节点就是要查找的节点
        return mid.value;
    }

    // 基于下标的修改
    public String set(int index,String value) {
        // 判断index
        if (index < 0 || index >= size) {
            throw new RuntimeException("index is illegal!");
        }
        // 寻找index位置
        // 定义一个节点用于遍历
        Node mid = head;
        // 定义一个标记用于比较index
        int tag = 0;
        if (index < size / 2) {
            // 左半区寻找
            while (index != tag) {
                // mid后移
                mid = mid.next;
                tag++;
            }
        }else{
            // 右半区寻找
            mid = tail;
            tag = size - 1;
            while (tag != index) {
                // mid前移
                mid = mid.pre;
                tag--;
            }
        }
        // 处理 mid这个节点就是要查找的节点
        String oldValue = mid.value;
        // 修改操作
        mid.value = value;
        return oldValue;
    }
}
