package com.cskaoyan._05oop1._03use;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/2 14:42
 **/
/*
张三养了3只狗，一只1岁白色萨摩亚，一只2岁黄白柯基，一只3岁黄色金毛

 */
public class Demo2 {
    public static void main(String[] args) {
        // 创建3个狗对象
        // 快捷键 alt+enter 自动补全
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        // 使用new关键字就会创建新的对象，两条new语句创建的对象是完全独立的。
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog1 == dog2);// false

        dog1.name = "萨摩耶";
        dog1.age = 1;
        dog1.color = "白色";

        dog2.name = "柯基";
        dog2.age = 2;
        dog2.color = "黄白色";

        dog3.name = "金毛";
        dog3.age = 3;
        dog3.color = "黄色";
        System.out.println("第一只狗的信息: 姓名-" + dog1.name +
                "年龄-" + dog1.age + "颜色-" + dog1.color);

        System.out.println("第二只狗的信息: 姓名-" + dog2.name +
                "年龄-" + dog2.age + "颜色-" + dog2.color);
        System.out.println("第三只狗的信息: 姓名-" + dog3.name +
                "年龄-" + dog3.age + "颜色-" + dog3.color);

        dog1.eat("肉骨头");
        dog2.eat("狗粮");

        // 类中没有的属性和行为，对象是不可能有的，
        // 类是模板，模板中有才能体现在对象中。
        //Cannot resolve symbol 'gender
        //dog1.gender
        //dog1.sleep();
    }
}

class Dog{
    // 定义成员变量
    String name;
    int age;
    String color;

    // 行为
    public void eat(String food) {
        System.out.println("eat " + food);
    }

    public void temp() {
        // 可以在成员方法中直接访问成员变量
        System.out.println(age);
        System.out.println(name);

        temp2();
    }

    public void temp2() {
        // 可以在成员方法中直接访问成员变量
        System.out.println(age);
        System.out.println(name);
    }

    // 静态方法
    public static void temp3() {
        // 静态方法中无法直接访问成员变量/成员方法
        // Non-static field 'age' cannot be referenced from a static context
        // System.out.println(age);
        // System.out.println(name);
        // temp2();
    }
}