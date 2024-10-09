package com.cskaoyan._08object._06clone;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/9 10:59
 **/
/*
源码:
    protected native Object clone() throws CloneNotSupportedException;
    throws: 抛出异常
    CloneNotSupportedException: 克隆异常
    protected : 同包下随便访问,不同包只有在子类中 创建子类对象

想要使用clone方法 必须要实现Cloneable接口
空接口:主要起到一个标记的作用,没有要实现的抽象方法
比如 Cloneable,Serializable
 */
public class Demo implements Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException {
        // Student student = new Student("zs", 20);
        //student.clone;

        Demo demo = new Demo();
        System.out.println(demo);
        //Unhandled exception: java.lang.CloneNotSupportedException
        Object clone = demo.clone();
        System.out.println(clone);

        Student student = new Student("zs", 20);

        Student cloneStudent = student.clone();
        System.out.println(cloneStudent.age);
        System.out.println(cloneStudent.name);

        System.out.println(student == cloneStudent);
    }
}

// 实现Cloneable接口
class Student implements Cloneable{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 重写clone方法
    // 修改权限
    // 返回值类型改成自身类型
    @Override
    public Student clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        return ((Student) clone);
    }

}