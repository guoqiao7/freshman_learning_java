package com.cskaoyan._14generic._02generic_clazz;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/20 10:32
 **/

public class F <T> {
    T ft;
}
class S0 extends F{}
class S1 extends F<String>{ }
class S2 <E> extends F<Integer>{}
class S3 <E> extends F<E> {}
class S4 <T> extends F<T>{}

class FatherTest{
    public static void main(String[] args) {
        F<String> f = new F<>();
        String ft = f.ft;

        S0 s0 = new S0();
        // 没指明就是 默认Object类型
        Object ft1 = s0.ft;

        S1 s1 = new S1();
        String ft2 = s1.ft;

        S2<String> s2 = new S2<>();
        Integer ft3 = s2.ft;

        S3<String> s3 = new S3<>();
        // 父类 子类都是String类型 一致的
        String ft4 = s3.ft;

        S3<Integer> s31 = new S3<>();
        //父类 子类都是Integer类型 一致的
        Integer ft5 = s31.ft;

        S4<String> s4 = new S4<>();
        String ft6 = s4.ft;
        S4<Double> s41 = new S4<>();
        Double ft7 = s41.ft;

        /*
        如果父类有泛型, 当存在继承关系的时候, 类可以选择是否指明泛型

        1.如果父类没有指明泛型  默认Object类型
        2.如果父类指明了泛型
        - 子类如果没有指明泛型, 默认使用父类的泛型
        - 子类如果指明了泛型, 父子类泛型一致
        3.传入了子类指定的泛型，则父类与子类变量类型一致
         */
    }
}
