package com.cskaoyan._05oop1._11block._04classload;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/4 9:29
 **/
/*
类加载完整过程:
1.加载
    通过ClassLoader类加载器去加载.class文件
    在这个过程中,会在内存中生成一个Class对象(字节码文件对象)
2.链接
    a.验证: 对字节码文件正确性的校验 (aced babe..咖啡宝贝 魔法数字)
    b.准备: 为类中的静态成员分配空间 并赋予默认初始值
        static int a = 10; 此时a的值是0
    c.解析: 把符号引用替换为直接引用
        符号引用: 用一组符号来描述被引用的目标
        直接引用: 真实的内存地址
3.初始化
    给类中的静态成员赋真实的值,执行静态代码块中的内容

 */
public class Demo {

}

class Teacher{
    String name;
    Subject subject;
}

class Subject{
    String subjectName;
}