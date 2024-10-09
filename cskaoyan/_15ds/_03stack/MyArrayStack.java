package com.cskaoyan._15ds._03stack;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/23 10:35
 **/
// 栈的顺序存储--->底层使用数组
public class MyArrayStack<E> {
    // 初始容量
    private static int INIT_CAPACITY = 5;
    // 数组
    private Object[] values;
    private int size;

    public MyArrayStack() {
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

    // 入栈操作
    public boolean push(E value) {
        // 在数组的末尾进行操作 作为栈顶
        // 判断是否栈满
        if (isFull()) {
            // 如果满了进行扩容
            grow();
        }
        // 添加到栈顶 数组的末尾
        values[size] = value;
        // 表长+1
        size++;
        // 返回结果
        return true;
    }

    private void grow() {
        // 创建新数组
        Object[] newArray = new Object[values.length << 1];
        // 老数据复制到新数组
        System.arraycopy(values, 0, newArray, 0, values.length);
        // 更新values
        values = newArray;
    }


    // 出栈操作
    public E pop() {
        // 判断栈空
        if (isEmpty()) {
            throw new RuntimeException("stack is empty!");
        }
        // 弹出栈顶元素
        E value = (E) values[size - 1];
        // 栈顶元素删除
        values[size - 1] = null;
        // 表长-1
        size--;
        return value;
    }

    // 返回栈顶元素 但是不删
    public E peek() {
        // 判断栈空
        if (isEmpty()) {
            throw new RuntimeException("stack is empty!");
        }
        return (E) values[size - 1];
    }
}
