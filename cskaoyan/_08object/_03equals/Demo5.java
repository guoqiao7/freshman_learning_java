package com.cskaoyan._08object._03equals;

import java.math.BigDecimal;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/9 10:32
 **/
/*
构造方法:
BigDecimal(String val)
将 BigDecimal 的字符串表示形式转换为 BigDecimal。

成员方法:
减法
BigDecimal subtract(BigDecimal subtrahend)
加法:
BigDecimal add(BigDecimal augend)
 */
public class Demo5 {
    public static void main(String[] args) {
        // 构造方法:
        //BigDecimal(String val)
        BigDecimal b1 = new BigDecimal("1.0");
        BigDecimal b2 = new BigDecimal("0.9");

        // 减法
        //BigDecimal subtract(BigDecimal subtrahend)
        BigDecimal subtract = b1.subtract(b2);
        System.out.println(subtract); // 0.1
    }
}
