package com.cskaoyan._05oop1._02define;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/2 14:06
 **/
/*
类自身的定义
[类修饰符列表] class 类名{
	// 类体
}

注意:
    一个java文件中只能有1个public的类
    定义类的时候不要嵌套(不要把一个类定义到另一个类的里面--->内部类)

类中结构的定义
    1.成员变量--->描述共有属性
    2.成员方法--->描述共有行为

 */


public class Demo {

}

class A{

}

class B{

}
// Demo / A/ B这3个类属于同包(package)关系


// 外部类
class Outer{
    // 内部类
    class Inner{

    }
}