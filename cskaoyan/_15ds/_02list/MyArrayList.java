package com.cskaoyan._15ds._02list;

import java.util.Objects;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/22 14:14
 **/
/*
线性表的顺序存储--->底层使用数组
 */
public class MyArrayList {
    // 基本结构
    // 数组初始容量
    private static int INIT_CAPACITY = 5;
    // 底层数组
    private String[] values;
    // 记录个数
    private int size;
    // 初始化

    public MyArrayList() {
        values = new String[INIT_CAPACITY];
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

    // 基于内容的增删改查操作
    // 基于内容的增
    public boolean add(String value) {
        // 判断容量
        if (isFull()) {
            // 如果满了 扩容
            grow();
        }
        // 没满
        // 默认添加到末尾
        values[size] = value;
        // 表长+1
        size++;
        // 返回结果
        return true;
    }

    private void grow() {
        // 创建新的数组
        // String[] newArray = new String[values.length * 2];
        // 更高效的写法 使用移位运算 <<
        String[] newArray = new String[values.length << 1];
        // 把老数据复制到新的数组中
        //for (int i = 0; i < values.length; i++) {
        //    newArray[i] = values[i];
        //}
        // 利用System中的方法
        System.arraycopy(values, 0, newArray, 0, values.length);
        // 更新values
        values = newArray;
    }

    // 基于内容的删
    public boolean remove(String value) {
        // 寻找要删除元素的下标
        int index = -1;
        // 遍历找
        for (int i = 0; i < size; i++) {
            if (Objects.equals(values[i], value)) {
                // 找到了
                index = i;
            }

        }
        if (index == -1) {
            return false;
        }
        // 调用基于下标的remove
        return remove(index);
    }

    // 基于内容的查
    public boolean contains(String value) {
        // 判断容量
        if (isEmpty()) {
            // 返回false
            // 抛出异常
            throw new RuntimeException("list is empty!");
        }
        // 从头开始依次查找
        for (String s : values) {
            if (Objects.equals(s, value)) {
                // 找到了
                // 返回结果
                return true;
            }
        }
        // list中没存目标数据
        return false;
    }

    // 基于内容的改
    public boolean set(String oldValue, String newValue) {
        // 容量判断
        if (isEmpty()) {
            // false
            // 异常
            throw new RuntimeException("list is empty!");
        }
        // 依次遍历
        for (int i = 0; i < values.length; i++) {
            if (Objects.equals(values[i], oldValue)) {
                // 找到了目标数据
                // 修改
                values[i] = newValue;
                // 返回结果
                return true;
            }
        }
        // list中没存
        return false;
    }


    // 基于下标的增删改查操作
    // 基于下标的增
    public boolean add(int index, String value) {
        // 判断index是否合法
        if (index < 0 || index > size) {
            throw new RuntimeException("index is illegal!");
        }
        // 判断容量是否满
        if (isFull()) {
            // 扩容
            grow();
        }
        // 插入到index位置
        for (int i = size-1; i >=index ; i--) {
            // 元素后移1个位置
            values[i + 1] = values[i];
        }
        // 在index位置上插入
        values[index] = value;
        // 表长+1
        size++;
        // 返回结果
        return true;
    }

    // 基于下标的删
    public boolean remove(int index) {
        // 判断index是否合法
        if (index < 0 || index >= size) {
            throw new RuntimeException("index is illegal!");
        }
        // 通过下标进行删除
        for (int i = index; i < size - 1; i++) {
            // 把index后面的元素往前移动一位
            values[i] = values[i + 1];
        }
        // 末尾置空
        values[size - 1] = null;
        // 表长-1
        size--;
        return true;
    }

    // 基于下标的查
    public String contains(int index) {
        // 判断index是否合法
        if (index < 0 || index >= size) {
            throw new RuntimeException("index is illegal!");
        }
        // 返回index的元素
        return values[index];
    }
    // 基于下标的改
    public String set(int index,String newValue) {
        // 判断index是否合法
        if (index < 0 || index >= size) {
            throw new RuntimeException("index is illegal!");
        }
        // 取出index位置的元素
        String oldValue = values[index];
        values[index] = newValue;
        return oldValue;
    }
}
