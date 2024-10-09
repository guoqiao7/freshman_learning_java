package com.cskaoyan._15ds._04queuq;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/23 14:31
 **/
// 队列的顺序存储 --->底层使用循环数组
public class MyArrayQueue<E> {
    // 基本结构
    // 初始大小
    private static int INIT_CAPACITY = 5;
    // 队头
    private int front;
    // 队尾
    private int rear;
    // 数组
    private Object[] values;
    // 队列大小
    private int size;

    public MyArrayQueue() {
        values = new Object[INIT_CAPACITY];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == values.length;
    }

    // 入队操作 offer
    public boolean offer(E value) {
        // 队列是否满
        if (isFull()) {
            // 如果满了 扩容
            grow();
        }
        // 队尾插入数据
        values[rear] = value;
        // 修改队尾 rear逻辑后移
        rear = (rear + 1) % values.length;
        // 表长+1
        size++;
        // 返回结果
        return true;
    }

    private void grow() {
        // 创建新数组
        Object[] newArray = new Object[values.length << 1];
        // 老数据赋值到新数组
        for (int i = 0; i < values.length; i++) {
            // 从旧数组的头进行标记
            int tag = (front + i) % values.length;
            newArray[i] = values[tag];
        }
        // 重置队头 队尾
        front = 0;
        rear = size;
        // 更新values
        values = newArray;
    }

    // 出队操作 poll
    public E poll() {
        // 判断队列是否空
        if (isEmpty()) {
            throw new RuntimeException("queue is empty!");
        }
        // 队列中只有1个元素
        // 出队后重置队头队尾
        if (size == 1) {
            // 获取队头元素
            E value = (E) values[front];
            // 删除队头元素
            values[front] = null;
            // 修改front rear
            front = 0;
            rear = 0;
            // 表长-1
            size--;
            return value;
        }
        // 获取队头元素
        E value = (E) values[front];
        // 删除队头
        values[front] = null;
        // front 逻辑后移
        front = (front + 1) % values.length;
        // 表长-1
        size--;
        // 返回队头元素
        return value;
    }
}
