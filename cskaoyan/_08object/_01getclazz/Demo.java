package com.cskaoyan._08object._01getclazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/8 17:24
 **/
/*
源码:
     public final native Class<?> getClass();
     返回值类型: Class类型-->字节码文件对象
 */
public class Demo {
    public static void main(String[] args) {
        // 创建student对象
        Student student = new Student("zs", 20);
        // 获取Student类的字节码文件对象
        Class c1 = student.getClass();

        Class c2 = student.getClass();
        System.out.println(c1 == c2);

        // 获取类名
        String name = c1.getName();
        System.out.println(name);
        // com.cskaoyan._08object._01getclazz.Student 全类名
        String simpleName = c1.getSimpleName();
        System.out.println(simpleName);
        // Student

        Class superclass = c1.getSuperclass();
        System.out.println(superclass);
        // java.lang.Object
        Class[] interfaces = c1.getInterfaces();

        // 获取构造器 Constructor
        Constructor[] declaredConstructors = c1.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        // 获取成员变量 Field
        Field[] declaredFields = c1.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        // Method
        // c1.getDeclaredMethods()

    }
}

class Student{
    public String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }
}