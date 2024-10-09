package com.cskaoyan._08object._02toString;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/9 9:04
 **/
/*
toString源码:
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    返回值类型: String 字符串
    getClass(): 获取的是字节码文件对象
    getClass().getName(): 全限定类名
    @
    Integer.toHexString(hashCode()):--->16进制的字符串-->地址值

 */
public class Demo {
    public static void main(String[] args) {
        Stu stu = new Stu("zs", 20);
        System.out.println(stu);
        //com.cskaoyan._08object._02toString.Stu@677327b6
    }
}

class Stu{
    String name;
    int age;

    public Stu(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 重写toString方法

    @Override
    public String toString() {
        return "Stu[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ']';
    }
}
