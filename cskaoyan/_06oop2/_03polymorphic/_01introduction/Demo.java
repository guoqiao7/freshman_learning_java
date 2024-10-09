package com.cskaoyan._06oop2._03polymorphic._01introduction;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/8 10:11
 **/
/*
在Java的多态当中，多态指的是：

1. 同一种事物：同一个引用（即父类的引用）
2. 不同的情况：指向不同的对象（不同的子类对象）
3. 不同的状态：调用同名方法会体现出不同的行为

 总结来说，Java中的多态指的是，同一个父类引用指向不同子类对象时，
 调用同名成员方法，根据指向实际对象的不同，得到的行为也会随之不不同。

练习:

定义一个父类Phone, 3个子类Huawei, XiaoMi, Iphone去模拟多态场景.


根据上述定义，总结一下Java中多态发生的条件：
1. 必须存在继承，多态一定发生在父子类之间。
2. 必须存在方法重写，不同的子类需要重写父类中的同名方法。
3. 必须存在父类引用指向子类对象

不能发生多态的场景:
1.不允许继承 final修饰的class
2.没有方法重写 final修饰成员方法
3.没有父类引用指向子类对象
 */
public class Demo {
    public static void main(String[] args) {
        // 同一个父类引用
        Phone phone;
        // 指向不同的子类对象
        phone = new Huawei();
        // 调用同名的方法
        phone.aiAssistant();

        phone = new Iphone();
        phone.aiAssistant();
    }
}

class Phone{
    // 提供一个调用语音助手的方法
    public void aiAssistant() {
        System.out.println("语音助手!");
    }
}

class Huawei extends Phone{
    @Override
    public void aiAssistant() {
        System.out.println("小易小易,今天天气怎么样?");
    }
}

class XiaoMi extends Phone{
    @Override
    public void aiAssistant() {
        System.out.println("小爱同学,我今天帅不帅?");
    }
}

class Iphone extends Phone{
    @Override
    public void aiAssistant() {
        System.out.println("嘿Siri,过年是什么时候?");
    }
}