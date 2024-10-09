package com.cskaoyan._01basic._05varible;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 10:45
 **/
/*
1. 使用Java代码计算 10 / 3.0
2. 使用Java代码计算 1 - 0.9
--->近似值

十进制正小数（0.开头）转换成二进制，先用小数部分乘以2，取结果的整数部分(必然是1或者0)
1. 然后小数部分继续乘2
2. 直到小数部分为0，或者已经达到了最大的位数
3. 最终的结果（0.开头）正序排列
0.1 x 2 = 0.2  -->0
0.2 x 2 = 0.4  -->0
0.4 x 2 = 0.8  -->0
0.8 x 2 = 1.6  -->1
0.6 x 2 = 1.2  -->1
0.2 x 2 = 0.4  -->0
....
无限循环
 */
public class Demo3 {
    public static void main(String[] args) {
        System.out.println(10 / 3.0);
        System.out.println(1-0.9);
    }
}
