package com.cskaoyan._05oop1._07constructor._01introduction;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/2 17:06
 **/
/*
创建一个教师类，有课程和年龄两个属性，行为是上课。
现在我们需要创建以下对象：
1. 18岁的Java老师对象
2. 28岁的C++老师对象
3. 30岁的Python老师对象
 */
public class Demo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        Teacher t3 = new Teacher();

        t1.age = 18;
        t1.course = "Java";

        t2.age = 28;
        t2.course = "C++";

        t3.age = 38;
        t3.course = "python";

        // 希望有一种简单的赋值方式

    }
}
class Teacher{
    String course;
    int age;

    public void teach() {
        System.out.println("teach!");
    }

}