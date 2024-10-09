package com.cskaoyan._06oop2._01encasulation._01basic;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 10:51
 **/

public class Student {
    // 对不想被访问的属性 使用private修饰 私有化
    public String name;
    private int age;
    private int score;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // 给外部提供一个public的方法 来访问私有的属性
    // getXXX
    public int getAge() {
        return this.age;
    }

    // 给外部一个修改属性的方法
    // setXXX
    public void setAge(int age) {
        // 判断一下是否是管理员
        // 才允许修改
        // 数据的校验
        // 看一下数据是否符合逻辑
        // 1-100 之间是合法的数据
        if (age > 0 && age < 150) {
            this.age = age;

        }
    }

    // 快捷键 alt+insert


    public int getScore() {
        // 只有老师能够看到所有学生的成绩
        // 进行权限校验
        // 如果是管理员 老师 允许返回这个分数
        // 如果是普通学生 返回一个默认值 或者提示一下没有权限
        return score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
