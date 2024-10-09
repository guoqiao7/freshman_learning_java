package com.cskaoyan._07oop3._02interface._05ex;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/8 16:29
 **/
/*
> 小试牛刀请用所学知识分析：这个案例中有哪些抽象类，哪些接口，哪些具体类。
现在有乒乓球运动员和篮球运动员，乒乓球教练和篮球教练。
为了能够出国交流，跟乒乓球相关的人员都需要学习英语。
 */
public class Demo {
    public static void main(String[] args) {
    }
}
// 抽象教练类
abstract class Coach{
    String name;
    double salary;

    public Coach(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // 共有的行为
    // 抽象方法
    public abstract void teach();
}

// 具体的教练类
class BasketBallCoach extends Coach{


    public BasketBallCoach(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void teach() {
        System.out.println("teach basketball");
    }
}

class PingPangCoach extends Coach implements Learning{


    public PingPangCoach(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void teach() {
        System.out.println("teach ping pang");
    }

    @Override
    public void learnEnglish() {
        System.out.println("看电影学英语!");
    }
}


// 抽象运动员类
abstract class Player{
    String name;
    double bonus;

    // 定义抽象的方法
    public abstract void play();
}

class BasketBallPlayer extends Player{

    @Override
    public void play() {
        System.out.println("打篮球比赛");
    }
}

class PingPangPlayer extends Player implements Learning{

    @Override
    public void play() {
        System.out.println("进行乒乓球比赛");
    }

    @Override
    public void learnEnglish() {
        System.out.println("听课学英语");
    }
}

interface Learning{
    void learnEnglish();
}