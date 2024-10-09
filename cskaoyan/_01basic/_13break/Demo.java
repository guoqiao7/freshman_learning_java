package com.cskaoyan._01basic._13break;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 8:48
 **/
/*
break就有了两个使用场景：
1. switch语句中某个case分支，用于结束整个switch。
2. 循环语句中,表示结束当前循环(如有嵌套循环, 结束当前层次循环, 和外层没有关系)
 */
public class Demo {
    public static void main(String[] args) {
        // 单层for
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println(i);
                break;
            }
        }
        //嵌套循环
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    System.out.println(j);
                    break;
                }
            }
        }
    }
}
