package com.cskaoyan._14generic._02generic_clazz;

import org.junit.Test;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/20 10:21
 **/

public class GenericClazzTest {
    @Test
    public void test1() {
        // 第一种写法: 前后两个尖括号, 都指明泛型类型, 这是jdk1.5的标准写法
        User<String,String> user = new User<String,String>();
        String data1 = user.data1;
        String data2 = user.data2;

        //第二种写法: 可以省略后面简括的里面的内容, 这是第一种写法省略写法,
        // 本质是等价的, 在jdk1.7的时候的改进
        User<String, String> user1 = new User<>();
        String data11 = user1.data1;

        // 第三种写法: 某个泛型类要求使用泛型, 但是在具体使用的时候,
        // 没有传入泛型; 使用了泛型地方默认为Object类型 (不推荐这种写法: 虽然语法上允许, 但是很奇葩)
        User user2 = new User();
        Object data12 = user2.data1;
        Object data21 = user2.data2;
    }

    @Test
    public void test2() {
        // 多个泛型的写法
        User2<String, Integer> user = new User2<>();
        String data1 = user.data1;
        Integer data2 = user.data2;

        // 多个泛型的时候 要么不传 要么全传
        // User2 user2 = new User2<String>();

        // 注意: 泛型必须是引用数据类型 不能是基本数据类型
        // User2<String, int> user2 = new User2<String, int>();
    }
}
