package com.cskaoyan._05oop1._07constructor._01introduction;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/2 17:13
 **/
/*
构造方法基本语法
[访问权限修饰符] 类名(形参列表){
	// 构造方法体 do sth
}
1. 权限修饰符先使用public
2. 构造方法名必须跟类名相同(一模一样,包括大小写)
3. 构造方法没有返回值, 也不需要写返回值
4. 形参列表可以为空, 称为无参构造方法,非空为有参构造方法
5. 构造方法体，和一般方法类似，可以写语句
理解:
   创建对象过程中会自动执行的一个特殊的方法
作用:
    给成员变量赋值

<init>--->构造方法对应的构造方法栈帧Frame 也会进栈
 */
public class Demo2 {
    public static void main(String[] args) {
        // 创建Teacher对象 利用构造方法来完成赋值
        // 调用的是2参构造方法
        Teacher2 teacher2 = new Teacher2("C++", 30);
        System.out.println(teacher2.age);
        System.out.println(teacher2.course);

        Teacher2 teacher3 = new Teacher2();

    }

    public void m1() {
        // do sth
    }
}

class Teacher2{
    String course;
    int age;

    // 构造方法
    public Teacher2() {
        // 无参构造方法
        System.out.println("无参构造方法");
    }


    public Teacher2(String tCourse,int tAge) {
        // 有参构造方法
        System.out.println("有参构造方法");
        // 完成对成员变量的赋值操作
        course = tCourse;
        age = tAge;
    }

    // 快捷键 alt+insert

    public Teacher2(String course) {
        // this.course 成员变量
        this.course = course;
    }

    public void teach() {
        System.out.println("teach!");
    }

}