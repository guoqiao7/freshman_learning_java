package com.cskaoyan._14generic._03genric_interface.ex;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/20 11:04
 **/

public class String2IntConvert implements Convert<String,Integer>{
    @Override
    public Integer convert(String s) {
        int i = Integer.parseInt(s);
        return i;
    }
}
