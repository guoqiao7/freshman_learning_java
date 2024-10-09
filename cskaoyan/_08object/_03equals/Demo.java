package com.cskaoyan._08object._03equals;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/9 9:22
 **/
/*
源码
  public boolean equals(Object obj) {
        return (this == obj);
    }
   引用类型用==比较的是地址值
   只有自己跟自己比才是true

 */
public class Demo {
    public static void main(String[] args) {
        Stu s1 = new Stu();
        Stu s2 = new Stu();
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s1));
    }
}
class Stu{

}
