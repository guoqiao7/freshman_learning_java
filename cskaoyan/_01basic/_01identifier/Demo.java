package com.cskaoyan._01basic._01identifier;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/28 16:59
 **/
/*
- 标识符的开头必须是：
  1. 字母（A~Z 和 a~z）
  2. 下划线（_）
  3. 美元符号（$）
  4. Unicode 字符集中编号为0xC0以及它后面的所有符号

 字符集/编码表 映射规则
 a   1
 b   2
 c   3
你   2000


- 标识符的组成必须是：
  1. 数字（0~9）
  2. 字母（A~Z 和 a~z）
  3. 美元符号（$）
  4. 下划线（_）
  5. Unicode 字符集中编号为0xC0以及它后面的所有符号
 */
public class Demo {
    // 快捷键 psvm / main
    public static void main(String[] args) {
        // 开头规则
        int a1 = 1;
        int A1 = 1;
        int _a = 1;
        int $1 = 1;
        int 你 = 1;
        int の = 1;

        // ASCII

        // 组成规则
        int a2 = 2;
        // 不能以数字开头
        // int 2a = 1;
        int 你2 = 2;

        // 不能使用关键字
        // int public = 1;

        // int hello world = 1;
    }

}
