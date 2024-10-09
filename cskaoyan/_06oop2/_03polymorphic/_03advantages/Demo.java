package com.cskaoyan._06oop2._03polymorphic._03advantages;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/8 10:29
 **/

public class Demo {
    public static void main(String[] args) {
        // 没使用多态
        //EZ ez = new EZ();
        //ez.skill();
        //
        //Timo timo = new Timo();
        //timo.skill();
        //
        //Garen garen = new Garen();
        //garen.skill();

        // 使用多态
        // 父类引用
        Hero hero ;
        // 指向不同的子类对象
        hero = new EZ();
        hero.skill();
        hero = new Garen();
        hero.skill();

    }
}

class Hero{
    public void skill() {
        System.out.println("释放技能");
    }
}

class EZ extends Hero{
    @Override
    public void skill() {
        System.out.println("精准弹幕!");
    }
}

class Timo extends Hero{
    @Override
    public void skill() {
        System.out.println("种蘑菇!");
    }
}

class Garen extends Hero{
    @Override
    public void skill() {
        System.out.println("德玛西亚之力!");
    }
}