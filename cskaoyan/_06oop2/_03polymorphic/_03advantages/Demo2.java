package com.cskaoyan._06oop2._03polymorphic._03advantages;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/8 10:33
 **/
/*
科学家要收集动物的叫声去研究，先要收集猫，狗两种动物的叫声研究。
随后又扩展到其它动物，最后又需要研究人类。
 */
public class Demo2 {
    public static void main(String[] args) {
        // 收集狗的叫声的方法
        // collectDogVoice(new Dog());
        // 收集猫的叫声的方法
        // collectCatVoice(new Cat());

        // 专门收集动物的方法
        collectAnimalVoice(new Dog());
        collectAnimalVoice(new Cat());
        collectAnimalVoice(new Tiger());
        collectAnimalVoice(new Human());

    }

    public static void collectDogVoice(Dog dog) {
        dog.shout();
    }

    public static void collectCatVoice(Cat cat) {
        cat.shout();
    }

    // 定义一个收集老虎的叫声的方法
    //public static void collectTigerVoice(Tiger tiger) {
    //    tiger.shout();
    //}

    // 希望有一个一劳永逸的方法 万能的方法 只要是动物
    public static void collectAnimalVoice(Animal animal) {
        // 使用多态 animal父类引用 指向传过来的具体的对象
        // 调用同名的方法
        // animal.shout();
        // 想要调用子类自身的行为 work方法
        // 不能直接调用
        // 必须要进行强制类型转换
        // 转换的时候可能会有ClassCastException异常
        // 先要进行类型判断 满足要求 再转  使用instanceof关键字来做判断
        if (animal instanceof Human) {
            ((Human) animal).work();
        }
        animal.shout();
    }

}
class Animal{
    public void shout() {
        System.out.println("动物叫!");
    }
}

class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("汪汪汪!");
    }
}

class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("喵喵喵!");
    }
}

class Tiger extends Animal{
    @Override
    public void shout() {
        System.out.println("嗷嗷嗷!");
    }
}

class Human extends Animal{
    @Override
    public void shout() {
        System.out.println("啊啊啊啊!");
    }

    // 属于人类的属性跟行为
    // 属于子类独有的方法
    public void work() {
        System.out.println("每天996,就喜欢加班,浪费公司电,浪费公司水!");
    }
}