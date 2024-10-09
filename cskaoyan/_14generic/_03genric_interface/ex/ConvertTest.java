package com.cskaoyan._14generic._03genric_interface.ex;

import org.junit.Test;

import java.util.Date;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/20 11:02
 **/

public class ConvertTest {
    @Test
    public void testString2DateConvert() {
        String2DateConvert convert = new String2DateConvert();
        Date date = convert.convert("2024-01-20 11:00:00");
        System.out.println(date);
    }

    @Test
    public void testString2IntConvert() {
        String2IntConvert convert = new String2IntConvert();
        Integer result = convert.convert("100");
    }
}
