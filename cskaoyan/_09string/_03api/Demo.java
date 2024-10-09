package com.cskaoyan._09string._03api;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/9 16:24
 **/
// 判断功能
public class Demo {
    public static void main(String[] args) {
        // 用来比较字符串的内容，注意区分大小写
        //boolean equals(Object obj)
        // "abc" "Abc"

        //忽略字符串大小写比较字符串内容，常见用于比较网址URL
        //boolean equalsIgnoreCase(String str)

        //判断当前字符串对象是否包含，目标字符串的字符序列
        //boolean contains(String str)
        String s = "abcdef";
        System.out.println(s.contains("bc"));
        //判断当前字符串对象，是否已目标字符串的字符序列开头
        //boolean startsWith(String str)
        System.out.println(s.startsWith("ab"));
        //判断当前字符串，是否以目标字符串对象的字符序列结尾，常用于确定文件后缀名格式
        //boolean endsWith(String str)
        System.out.println(s.endsWith(".txt"));
        //判断一个字符串，是不是空字符串
        //boolean isEmpty() ""  null
        System.out.println(s.isEmpty());
    }
}
