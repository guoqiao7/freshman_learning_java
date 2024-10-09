package com.cskaoyan._05oop1._12import.one;

// import com.cskaoyan._05oop1._12import.another.Student;
/**
 * @description:
 * @author: 景天
 * @date: 2024/1/4 10:36
 **/

public class StudentTest {
    public static void main(String[] args) {
        // 直接创建对象 默认用的是同包one 下的Student
        //Student student = new Student();
        //student.test();

        // 想要使用别的包中的同名的类,用import导入
        com.cskaoyan._05oop1._12import.another.Student student =
                new com.cskaoyan._05oop1._12import.another.Student();
        student.test();

        String s = "abc";
    }
}
