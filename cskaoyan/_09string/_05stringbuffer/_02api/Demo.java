package com.cskaoyan._09string._05stringbuffer._02api;

import org.junit.Test;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/10 10:09
 **/

public class Demo {
    // 构造方法
    @Test
    public void test1() {
        // public StringBuffer() // 默认容量是16
        StringBuffer sb = new StringBuffer();

        //public StringBuffer(int capacity)// 容量是capacity
        StringBuffer sb2 = new StringBuffer(20);

        //public StringBuffer(String str)// str的长度+16
        StringBuffer sb3 = new StringBuffer("abc");
    }

    // 成员方法
    @Test
    public void test2() {
        StringBuffer sb = new StringBuffer();
        // 获取功能
        //public int capacity() 返回当前容量,数组的长度,理论值
        int capacity = sb.capacity();
        System.out.println("capacity = " + capacity);
        //public int length() 返回长度(字符的个数),实际值
        int length = sb.length();
        System.out.println("length = " + length);

        //添加功能
        //public StringBuffer append(String s) 将指定的字符串(其他类型有重载方法)追加到此字符序列的尾部
        sb.append("abc");
        System.out.println(sb);
        //在指定位置把任意类型的数据插入到字符串缓冲区里面
        //public StringBuffer insert(int offset,String str)
        sb.insert(1, "xyz");
        System.out.println(sb);
        //删除功能
        //public StringBuffer deleteCharAt(int index)：删除指定位置的字符
        sb.deleteCharAt(1);
        System.out.println(sb);
        //public StringBuffer delete(int start,int end)：删除从指定位置开始指定位置结束的内容
        sb.delete(1, 3);
        System.out.println(sb);

        //替换功能
        //使用给定String中的字符替换词序列的子字符串中的字符
        //public StringBuffer replace(int start,int end,String str)
        sb.replace(0, 2, "xyz");
        System.out.println(sb);
        //反转功能
        //public StringBuffer reverse()：将此字符序列用其反转形式取代，返回对象本身
        sb.reverse();
        System.out.println(sb);
    }
}
