package com.cskaoyan._09string._07temp;

import java.util.Random;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/11 8:42
 **/

public class Demo {
    public static void main(String[] args) {
        String password = getRandomPassword(3);
        System.out.println(password);
        // 000-999
        //for (int i = 0; i < 1000; i++) {
        //    String format = String.format("%03d", i);
        //    System.out.println(format);
        //}
    }

    private static String getRandomPassword(int len) {
        String pool = "0123456789";
        Random random = new Random();
        String password = "";
        for (int i = 0; i < len; i++) {
            int index = random.nextInt(pool.length());
            password+= pool.charAt(index);
        }
        return password;
    }
}
