package com.cskaoyan._05oop1._11block._02constructor;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/3 17:10
 **/
/*
构造代码块
    位置:---->成员位置
    作用:---->给成员变量赋值

给成员变量赋值的方式:
1.默认赋值
2.显式赋值
3.构造器赋值
4.构造代码块赋值

通过测试得出赋值的顺序
1.永远是默认第一步
4.构造器是最后一步

第一次测试:
    显示赋值先执行 构造代码块后执行
第二次测试:
    构造代码块先执行 显示赋值后执行

===>结论
1.永远是默认第一步
显式赋值跟构造代码块赋值顺序不一定 取决于代码书写顺序
写在上面的结构先执行,下面的代码后执行
4.构造器是最后一步
 */
public class Demo {
    // 成员位置
    {
        // 构造代码块
    }
    public static void main(String[] args) {
        Student student = new Student("ww",30);
        System.out.println(student.age);
        System.out.println(student.name);
    }

    // 成员位置
    {
        // 构造代码块
    }
}


class Student{
    String name = "ls";
    int age = 21;
    {
        name = "zs";
        age = 20;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}