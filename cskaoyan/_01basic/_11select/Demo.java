package com.cskaoyan._01basic._11select;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 16:56
 **/
/*
选择结构:
1.if --->99
2.switch--->1

if condition之间的关系：
1. 如果多个条件之间是互斥关系，那么谁在前，谁在后，没什么影响。
2. 如果多个条件之间是包含关系，被包含的条件如果放在了下面，就永远不能生效了
 */
public class Demo {
    public static void main(String[] args) {
        // 单分支
        //if () {
        //    // do sth
        //}

        // 双分支
        //if () {
        //    // do sth
        //}else{
        //    // do sth
        //}

        // 多分支结构
        //if () {
        //    // do sth
        //}else if(){
        //   // ...
        //} else if () {
        //    // do sth
        //} else {
        //    // do sth
        //}

        int n = 10;
        if (n > 0) {
            // do sth
        } else if (n > 5) {
            // 条件中有包含关系 永远不会执行
            // do sth
        }
    }
}
