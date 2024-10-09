package com.cskaoyan._06oop2._02extends._04advantages;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 15:40
 **/
/*
练习：
在一款游戏中，我们设计了三种类型的鸭子，这些鸭子有一些共同的属性，
也有共同的行为，比如都可以叫，都会游泳等。
编写程序，描述这些鸭子。

后来，需求更改了，这些鸭子不能游泳了，但是都会飞，怎么改呢？

再后来，需求又改了，新增了一种鸭子，但这个鸭子不会飞，又怎么办呢？
 */
public class Demo {
    public static void main(String[] args) {
        FirstDuck firstDuck = new FirstDuck();
        // firstDuck.swim();
        firstDuck.fly();
        SecondDuck secondDuck = new SecondDuck();
        secondDuck.fly();

        firstDuck.eat();
        secondDuck.eat();

        FourthDuck fourthDuck = new FourthDuck();
        fourthDuck.name = "唐老鸭";
        fourthDuck.eat();
        fourthDuck.fly();
    }
}

/*
继承的好处:
    1.可维护性更强 扩展性
    2.代码能复用
缺点:
    无条件的继承父类的成员

 */
class Duck{
    String name;

    //public void swim() {
    //    System.out.println("swim----");
    //}
    public void fly() {
        System.out.println("fly");
    }

    public void eat() {
        System.out.println("eat");
    }
}

class FirstDuck extends Duck{

}
class SecondDuck extends Duck{

}

class ThirdDuck extends Duck{

}

class FourthDuck extends Duck{
    // 不想使用父类中的方法的实现的时候
    // 修改来自父类的方法
    public void fly() {
        System.out.println("不会飞");
    }

}