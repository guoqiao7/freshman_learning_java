package com.cskaoyan._07oop3._01abstract._04ex;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/8 14:56
 **/

public class Demo {
    public static void main(String[] args) {
        BaseStaff staff = new NormalStaff("zs", 1, 5000);
        staff.work();
        staff.printStaff();
        staff = new Coder("ls", 2, 15000);
        staff.work();
        staff.printStaff();
        // 强制转换
        if (staff instanceof Coder) {
            ((Coder) staff).overTimeWork();
        }
        staff = new Manager("ww", 3, 20000, 100000);
        staff.printStaff();
    }
}

// 抽象员工类
abstract class BaseStaff{
    // 共有的属性
    String name;
    int id;
    double salary;

    public BaseStaff(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // 共有的行为
    // 抽象的方法
    public abstract void work();

    public void printStaff() {
        System.out.println("员工编号: " + id+ " 姓名: " + name+
                " 工资: " + salary);
    }
}

// 定义普通员工类
class NormalStaff extends BaseStaff{
    public NormalStaff(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("每天负责接待,端茶倒水,打扫卫生!");
    }
}

// 定义程序员类
class Coder extends BaseStaff{

    public Coder(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("每天负责写代码,改需求,跟产品撕逼!");

    }

    // 定义自己独有的方法
    public void overTimeWork() {
        System.out.println("每天996,大家都是兄弟!");
    }
}

class Manager extends BaseStaff{
    // 定义自己独有的属性
    double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("每天看大家干活!");
    }

    @Override
    public void printStaff() {
        System.out.println("员工编号: " + id + " 姓名: " + name +
                " 工资: " + salary + " 奖金: " + bonus);
    }
}