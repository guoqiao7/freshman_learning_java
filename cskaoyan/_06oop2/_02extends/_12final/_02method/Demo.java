package com.cskaoyan._06oop2._02extends._12final._02method;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/8 9:02
 **/
/*
final修饰方法---->表示这个成员方法不能被重写

注意：

并不是随便拿一个方法都能用final修饰的，比如：
1. private方法，本来就无法重写，不需要多此一举。（可以修饰，但是会报警告）
2. static方法，本来就无法重写，不需要多此一举。（可以修饰，但是会报警告）
3. 构造方法，不能被继承，更不能重写，加final修饰会编译报错。
 */
public class Demo {
    public static void main(String[] args) {

    }
}

class Father{
    public final void m1() {

    }

    // private' method declared 'final'
    private final void m2() {

    }

    //Modifier 'final' not allowed her
    //final public Father() {
    //}

    // static' method declared 'final'
    public static  void m3() {

    }
}

class Son extends Father{
    // m1()' cannot override 'm1()' in
    // 'com.cskaoyan._06oop2._02extends._12final._02method.Father';
    // overridden method is final
    //@Override
    //public void m1() {
    //}

    //@Override
    //public void m2() {
    //
    //}
}