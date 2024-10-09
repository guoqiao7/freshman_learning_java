package com.cskaoyan._05oop1._10anonymous;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/3 17:02
 **/
/*
匿名对象: 没有名字的对象 , 没有引用指向的对象
 */
public class Demo {
    public static void main(String[] args) {
        Stu stu = new Stu();
        // 匿名对象
        new Stu();
        new Stu();
        new Stu();

        m1(stu);
        // 匿名对象的使用 ,作为方法的实际参数
        m1(new Stu());
        m1(new Stu());
        m1(new Stu());
    }



    public static void m1(Stu s) {

    }


    public static Stu m2() {
        // 之前写法
        //Stu stu = new Stu();
        //return stu;

        // 使用匿名对象来作为方法的返回结果
        return new Stu();
    }
}
class Stu{

}
