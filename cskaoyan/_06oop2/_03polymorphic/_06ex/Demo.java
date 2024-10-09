package com.cskaoyan._06oop2._03polymorphic._06ex;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/8 14:12
 **/

public class Demo {
    public static void main(String[] args) {
        Father fs = new Son();
        System.out.println(fs.age);//48
        fs.teach();//我会教C++
        //fs.playGame(); //不能打游戏，因为父类没这个成员
        Son son = (Son) fs;
        System.out.println(son.age);//28
        son.playGame();
    }
}

class Father {
    int age = 48;
    public void teach(){
        System.out.println("我要教Java");
    }
}
class Son extends Father {
    int age = 28;
    public void playGame(){
        System.out.println("喜欢玩大乱斗！");
    }
    @Override
    public void teach() {
        System.out.println("我会教C++");
    }
}