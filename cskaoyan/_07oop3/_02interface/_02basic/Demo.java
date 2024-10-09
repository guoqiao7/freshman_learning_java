package com.cskaoyan._07oop3._02interface._02basic;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/8 15:39
 **/
/*
接口跟类具有同等的地位
- 接口的访问权限修饰符也只有两种：
  1. public
  2. 默认缺省的
- 接口名和类名一样，遵循大驼峰式的书写规范，接口名最好起的见名知意。
有些程序员喜欢在接口前加一个大写字母I来直接， IXXX
表示该类型是一个接口，可以借鉴，但不强制。
- 接口中可以定义抽象方法，和抽象类中定义抽象方法没有区别。
- 接口是可以被一个类"继承"的，接口的"继承"，
更准确、常见的叫法称之为接口的实现。
当然它也不再使用extends关键字，而是使用 implements 关键字。
一个普通类实现接口必须实现所有抽象方法。它的语法是：
 [访问权限修饰符] class 类名 extends 类名 implements 接口名1,接口名2,... {}
 - 在接口的实现中，可以称呼接口为"父接口"，接口的实现类为"子类"，它们仍然是父子关系。当然多态现象仍然能够发生。

- 接口不受多继承限制，一个类可以在继承别的类的同时实现接口，而且可以实现多个接口。

接口的特点
1. 接口的声明特点
   1. 接口能不能创建对象? --->NO
   2. 接口能不能用final修饰?--->NO
2. 接口的实现类的书写格式
    工程上面: XXXImpl 实现类的命名 一般和接口放同一个包里面
3. 成员特点
   1. 能否定义属性(成员变量, 静态成员变量, 全局常量)?
    默认public static final --->定义的是全局常量
   2. 能否定义方法/行为?
    默认public abstract 抽象方法
4. 构造器--->No
5. 代码块--->NO
 */
public class Demo {
    public static void main(String[] args) {
        // 'IA' is abstract; cannot be instantiated
        // 接口不能创建对象 不能被实例化
        // IA ia = new IA();

    }
}

interface IA{

}
interface IB{

}
class A implements IA{

}

class B implements IA,IB{

}
interface IC{
    // 全局常量 默认是public static final的
    int a = 1;
    static int b = 1;
    public static int c = 1;
    public static final int d = 1;

    // 抽象方法
    public abstract void m1();

    // 没有构造器
    // Not allowed in interface
    //{
    //
    //}

    //static {
    //
    //}

    static void m2() {
        System.out.println("static method");
    }
}