package com.cskaoyan._09string._03api;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/9 16:38
 **/
/*
课堂练习：
	1：遍历获取字符串中的每一个字符
	"abc001DEF"
	2：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
 */
public class Ex1 {
    public static void main(String[] args) {
        // 定义字符串
        String s = "abc001DEF";
        // 定义计数器
        int countDigital = 0;
        int countUpper = 0;
        int countLower = 0;
        for (int i = 0; i < s.length(); i++) {
            // 取某个位置的字符
            char c = s.charAt(i);
            // 比较
            if (c >= 'a' && c <= 'z') {
                countLower++;
            } else if (c >= 'A' && c <= 'Z') {
                countUpper++;
            }else {
                countDigital++;
            }
            // 还可以使用包装类型 Character
            //Character.isUpperCase(c);
            //Character.isLowerCase(c);

        }

        System.out.println(countDigital);
        System.out.println(countUpper);
        System.out.println(countLower);
    }
}
