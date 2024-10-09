package com.cskaoyan._10exception._05finally;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/11 14:40
 **/
/*
try和finally是有作用域的 局部变量
一般定义在try外面,在finally中就可以使用了
 */
public class Demo7 {
    public static void main(String[] args) {
        Student student = null;
        try {
            student = new Student();
            int a = 1;
            System.out.println(111);

        } catch (RuntimeException e) {
            System.out.println("空指针异常");
        }
        finally{
            System.out.println("finally");
            // 能不能更改a的值
            // Cannot resolve symbol 'a'
            // a = 2;
            // System.out.println(student);
            if (student != null) {
                System.out.println(student.toString());
            }
        }
    }
}

class Student{

}