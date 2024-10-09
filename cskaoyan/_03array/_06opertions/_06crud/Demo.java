package com.cskaoyan._03array._06opertions._06crud;


import java.util.Arrays;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/31 10:28
 **/
/*
需求:
    String[] 长度为10  放几个人名 (人名不能重复)
    {"彭于晏","吴彦祖","周杰伦","张三",null......}
    对names 进行CRUD操作

 */
public class Demo {
    public static void main(String[] args) {
        String[] names = new String[10];
        names[0] = "彭于晏";
        names[1] = "吴彦祖";
        names[2] = "周杰伦";
        names[4] = "张三";

        int result = createName(names, "张三");
        switch (result) {
            case 1:
                System.out.println("满了!");
                break;
            case 2:
                System.out.println("重名!");
                break;
            case 3:
                System.out.println("成功了");
                break;
        }
        System.out.println(Arrays.toString(names));

    }
    /*
    create操作 向names中插入新的名字
    可能的情况:
        1.数组容量满了
        2.重名了
        3.成功了
    参数:names, 要插入的名字name
     */
    public static int createName(String[] names,String name) {
        // 重名的校验
        for (String s : names) {
            // null的校验
            if (s != null) {
                if (s.equals(name)) {
                    return 2;
                }

            }
        }
        // 执行到这里 说明没有重名的
        for (int i = 0; i < names.length; i++) {
            // 找到null的位置 插入新名字
            if (names[i] == null) {
                names[i] = name;
                return 3;
            }
        }
        // 说明此时数组满了
        return 1;

    }


    public static int findName(String[] names,String name) {
        // 定义下标志
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            // 判断null
            if (names[i] != null) {
                if (names[i].equals(name)) {
                    // 给index赋值
                    index = i;
                }
            }
        }

        return index;
    }



}
