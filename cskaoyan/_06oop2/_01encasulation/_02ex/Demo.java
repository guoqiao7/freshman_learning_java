package com.cskaoyan._06oop2._01encasulation._02ex;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 14:12
 **/
/*
基本使用:
定义一个员工Employer类,
类中有3个属性: 姓名 , 年龄 , 工资, 提供一个打印基本信息的public的方法

对上述例子进行修改, 要求通过无参构造方法去创建对象,
通过set方法对成员变量进行设置值, 要求年龄范围在1-100之间 , 工资在10K-15K范围内, 不在此范围内, 赋予默认值.


要求通过有参构造方法创建对象

 */
public class Demo {
    public static void main(String[] args) {
        //Employer employer = new Employer();
        //employer.setName("zs");
        //employer.setAge(-30);
        //employer.setSalary(15000);
        //employer.print();
        Employer employer = new Employer("zs", -20, 13000);
        employer.print();
    }
}


class Employer{
    public String name;
    private int age;
    private double salary;

    public Employer(String name, int age, double salary) {
        // 调用相应的set方法
        this.name = name;
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        }else {
            System.out.println("年龄不合法");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 10000 && salary <= 15000) {
            this.salary = salary;
        }else{
            System.out.println("工资不合理!");

        }
    }

    public void print() {
        System.out.println("name:" + name + "年龄:" + age +
                "salary:" + salary);
    }
}