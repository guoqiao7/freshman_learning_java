package com.cskaoyan._06oop2._01encasulation._01basic;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 10:51
 **/

public class Demo {
    public static void main(String[] args) {
        Student student = new Student("zs", 20,59);
        System.out.println(student.name);
        // age' has private access
        // System.out.println(student.age);

        // 通过访问入口 get方法来访问
        int score = student.getScore();
        System.out.println(score);

        // 同过set方法来修改
        student.setAge(21);
        student.setAge(-1);

    }
}
