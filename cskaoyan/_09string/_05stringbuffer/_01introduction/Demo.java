package com.cskaoyan._09string._05stringbuffer._01introduction;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/10 9:39
 **/
/*
如果一个空字符串””,让其拼接10000次,效率怎么样?
我们如果对字符串进行拼接操作，每次拼接，都会构建一个新的String对象，既耗时，又浪费空间。
 */
public class Demo {
    public static void main(String[] args) {
        String str = "";
        int sum=0;
        StringBuffer sb = new StringBuffer();
        // 时间戳 1970 1.1 0:0: 到此刻的毫秒数
        // 获取当前时间戳
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            // str += "a";
            // sum += 1; // 1 ms
            sb.append("a");// 6ms
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start); // 8440ms 8.4S
    }
}
