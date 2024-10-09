package com.cskaoyan._02method._06unittest;


import org.junit.Test;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 14:01
 **/
// DemoTest
public class Demo {
    //public static void main(String[] args) {
    //    System.out.println(1111);
    //    // do sth
    //}

    // 单元测试
    // 需要使用一个注解 @Test
    // @表示创建一个注解实例
    // 被测试的方法必须是public void 无参的方法才可以
    @Test
    public void myTest1() {
        // do sth
        System.out.println(111);
    }

    @Test
    public void myTest2() {
        // do sth
        System.out.println(2222);
    }

    @Test
    private void myTest3() {

    }

    @Test
    private void myTest4(int a) {

    }
}
