package com.cskaoyan._09string._03api;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/9 17:30
 **/
/*
课堂练习：
	1:给出一句英文句子： "i want a bing dun dun"
	2:每个单词的首字母都转换为大写并输出
	3.使用split方法

	"i want a bing dun dun"---> "I Want A Bing Dun Dun"
 */
public class Ex4 {
    public static void main(String[] args) {
        // 定义字符串
        String s = "i want a bing dun dun";
        // 使用split分隔--->String[]
        String[] strs = s.split(" ");
        // 遍历数组
        // 定义一个空的字符串用于拼接
        String newStr = "";
        for (String str : strs) {
            // 操作每个字符串
            String concat = str.substring(0, 1).toUpperCase().concat(str.substring(1));
            // 重新拼接
            newStr += concat + " ";
        }

        // 循环结束输出结果
        System.out.println(newStr.trim());

    }
}
