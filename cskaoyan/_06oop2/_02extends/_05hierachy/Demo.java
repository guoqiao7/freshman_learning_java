package com.cskaoyan._06oop2._02extends._05hierachy;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 15:55
 **/
/*
Java中是单继承的 extends后面只能跟1个类

几个概念
1. 祖先类：处在继承顶层的类。
2. 继承层次（hierarchy）：由某个祖先类派生出来的所有类的集合叫做继承层次。
3. 继承链：从某一个子类开始，到其祖先类的路径。
注意:
所有的类都继承Object类,Object类是所有类的父类

几个细节:
1. 在一条继承链中，总称呼下游类是上游类的子类，不管隔了几层。没有孙子类或者重孙类这种概念。
2. 在一条继承链中的，下游的类总是继承上游类的所有成员，不管隔了几层。
3. 在一条继承链中，下游类总可以看成一个上游类，存在"is-a"关系。
4. 不在同一条继承链中的类，没有任何关系。虽然看起来像"兄弟姐妹"类，但是Java是不讲究血统的。
   - 因为一方面，子类可以自由扩展功能；另一方面，继承来的东西也是可以修改的。
   - 所以"兄弟姐妹"可能完全和"我"不同，没有任何关系。
5. 不能循环定义继承。比如A继承B，B继承C，再让C来继承A，这是不行的。
6. 继承链可以无限延伸下去，但是一般来说有个5~6层继承，已经很多了。
 */
public class Demo {
    public static void main(String[] args) {
        Son son = new Son();
        //son.equals();
        //son.toString();
        //son.getClass();
        //

        GrandSon grandSon = new GrandSon();
        grandSon.methodGrandFather();
        grandSon.methodFather();
        grandSon.methodSon();

    }
}

class Animal{

}

class Dog1{

}

// Class cannot extend multiple classes
//class Dog extends Animal,Dog1{
//
//}

class GrandFather{
    public void methodGrandFather() {
        System.out.println("GrandFather");
    }
}

class Father extends GrandFather{
    public void methodFather() {
        System.out.println("Father");
    }
}

class Uncle extends GrandFather{

}


class Son extends Father{
    public void methodSon() {
        System.out.println("Son");
    }
}
class GrandSon extends Son{

}

// Cyclic inheritance involving 'com.cskaoyan._06oop2._02extends._05hierachy.A
//class A extends B{
//
//}
//class B extends C{
//
//}
//
//class C extends A{
//
//}