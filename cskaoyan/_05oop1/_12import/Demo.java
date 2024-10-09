// package声明必须放在文件开头 有限代码行第一行
package com.cskaoyan._05oop1._12import;

// Missing package statement: 'com.cskaoyan._05oop1._12import'

// 路径表示 com/cskaoyan/oop
//  D:/app2
import java.util.Scanner;





/**
 * @description:
 * @author: 景天
 * @date: 2024/1/4 10:22
 **/
/*
com.cskaoyan._05oop1._12import.Demo  全限定类名
 */
public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo);
        // 结果有几部分组成
        // 全类名
        // @
        // 十六进制地址
        // com.cskaoyan._05oop1._12import.Demo@677327b6
    }
}
class A{}
// 这2个类属于同包关系
// 都在com.cskaoyan._05oop1._12import 下面