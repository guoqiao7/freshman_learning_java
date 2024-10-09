package com.cskaoyan._06oop2._02extends._01introduction._02new;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 14:36
 **/
/*
[访问权限修饰符] class 类名 extends 被继承的类/已经存在的某个类{
    类体
}
1. 这个继承了一个已存在类的类，称之为子类。被继承的类称之为父类。
2. 使用继承extends(扩展)关键字后，子类就获取到了父类的所有成员（成员变量和成员方法）.
严格来说，继承只考虑对象相关成员的继承，静态成员我们先暂时不考虑。
3. 子类在继承父类的同时，还可以自己定义新的成员，
这叫做子类在父类的基础上进行扩展（所以子类往往比父类的功能更加强大，青出于蓝而胜于蓝。）
4. 子类不能继承父类没有的成员。
 */
public class Demo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "zs";
        System.out.println(teacher.name);
        System.out.println(teacher.tId);

        Student student = new Student();
        System.out.println(student.name);
        student.eat();
    }
}


class Person{
    String name;
    public void eat() {
        System.out.println("eat----");
    }
}
class Teacher extends Person{
    int tId;

    public void teach() {
        System.out.println("teach----");
    }
}

class Student extends Person{
    int sId;

    public void study() {
        System.out.println("study----");
    }
}